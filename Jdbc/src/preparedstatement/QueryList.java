package preparedstatement;

import util.JDBCUtil;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: CuiMingming
 * @Description:
 * @date: 2020-01-09 15:03
 */
public class QueryList {
    public static <T>List<T> QueryList(Class<T> clazz,String sql,Object ...args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0;i<args.length;i++){
                preparedStatement.setObject(i+1, args[i]);
            }
            resultSet = preparedStatement.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            ArrayList<T> list = new ArrayList<>();
            while (resultSet.next()){
                T t = clazz.newInstance();
                for (int i = 0;i<columnCount;i++){
                    Object columnValue = resultSet.getObject(i + 1);
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t, columnValue);
                }
                list.add(t);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeResource(connection, preparedStatement,resultSet);
        }
        return null;
    }
}
