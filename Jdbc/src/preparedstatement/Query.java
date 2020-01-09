package preparedstatement;

import util.JDBCUtil;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * @author: CuiMingming
 * @Description:   实现针对不同表的通用查询操作
 * @date: 2020-01-09 13:40
 */
public class Query {
    public static <T> T getInstance(Class<T> clazz,String sql,Object ...args) {
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
            if (resultSet.next()){
                //构造一个对象
                T t = clazz.newInstance();
                for (int i = 0;i<columnCount;i++){
                    Object columnValue = resultSet.getObject(i + 1);
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t, columnValue);
                }
                return t;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeResource(connection, preparedStatement,resultSet);
        }
        return null;
    }

}
