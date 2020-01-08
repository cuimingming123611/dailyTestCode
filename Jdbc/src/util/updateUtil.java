package util;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author: CuiMingming
 * @Description:
 * @date: 2020-01-08 17:04
 */
public class updateUtil {
    public static boolean update( String sql,Object ...args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int n = 0;
        try {
            //获取连接
            connection = JDBCUtil.getConnection();

            //预编译sql语句
            preparedStatement = connection.prepareStatement(sql);

            //填充占位符
            for (int i = 0;i<args.length;i++){
                preparedStatement.setObject(i+1,args[i]);
            }

            //执行操作
            n = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeResource(connection, preparedStatement);

            if (n >= 0){
                return true;
            }else {
                return false;
            }

        }


    }
}
