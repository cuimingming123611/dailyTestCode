package util;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author: CuiMingming
 * @Description: 操作数据库的工具类
 * @date: 2020-01-08 16:29
 */
public class JDBCUtil {
    public static Connection getConnection() throws Exception{
        /**
         * @description: 获取数据库的连接
          * @param
         * @return: java.sql.Connection
         * @author: CuiMingming
         * @date: 2020-01-08 16:31
         */
        //1、读取配置文件中的基本信息
        InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driverClass = properties.getProperty("driverClass");

        //2、加载驱动
        Class.forName(driverClass);

        //3、创建连接
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }


    public static void closeResource(Connection connection, PreparedStatement preparedStatement){
        /**
         * @description: 关闭数据库的连接资源
          * @param connection
         * @return: void
         * @author: CuiMingming
         * @date: 2020-01-08 16:32
         */
        try {
            if (connection != null){
                connection.close();
            }
            if (preparedStatement != null){
                preparedStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public static void closeResource(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
        /**
         * @description: 关闭数据库的连接资源
         * @param connection
         * @return: void
         * @author: CuiMingming
         * @date: 2020-01-08 16:32
         */
        try {
            if (connection != null){
                connection.close();
            }
            if (preparedStatement != null){
                preparedStatement.close();
            }
            if (resultSet != null){
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }




}
