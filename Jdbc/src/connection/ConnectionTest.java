package connection;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author: CuiMingming
 * @Description:  数据库的连接
 * @date: 2020-01-08 12:34
 */
public class ConnectionTest {
    //方式一
    @Test
    public void testConnection1() throws SQLException {
        //声明driver驱动
        Driver driver = new com.mysql.jdbc.Driver();
        //设置数据库地址
        String url = "jdbc:mysql://localhost:3306";
        //将账号和密码封装在properties中
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "123456");
        //创建连接
        Connection connect = driver.connect(url, info);
        System.out.println(connect);


    }

    //方式二:在程序中不出现第三方的api，使得程序具有更好的可移植性
    public void testConnection2() throws Exception{
       //1、获取driver实现类对象：使用反射
        Class clazz = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();

        //2、提供需要连接的数据库
        String url = "jdbc:mysql://localhost:3306/test";

        //3、将账号和密码封装在properties中
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "123456");

        //4、获取连接
        Connection connect = driver.connect(url, info);
        System.out.println(connect);

    }

    //方式三：使用DriverManager类
    @Test
    public void testConnection3() throws Exception{


        //1、提供另外三个基本信息
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123456";

        //2、获取Driver实现类的对象
        Class aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();
        //注册驱动
        DriverManager.registerDriver(driver);

        //获取连接
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);

    }

    //最终版本:将数据库的基本信息，加载在配置文件中，读取配置文件
    public Connection getConnection() throws Exception {
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


}
