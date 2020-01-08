package preparedstatement;

import connection.ConnectionTest;
import org.junit.Test;
import util.JDBCUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: CuiMingming
 * @Description: 使用preparedStatement替换statement，实现对数据表的增删改操作
 * @date: 2020-01-08 14:17
 */
public class PreparedStatementUpdateTest {
    //添加数据
    @Test
    public void testInsert()  {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            ConnectionTest connectionTest = new ConnectionTest();
            connection = connectionTest.getConnection();
            //System.out.println(connection);

            //预编译sql语句，返回prepareStatement的实例
            String sql = "insert into customers(`name`,email,birth) values(?,?,?)";
            statement = connection.prepareStatement(sql);

            //填充占位符
            statement.setString(1,"崔明明");
            statement.setString(2,"1020120120@qq.com");
            //转化时间格式
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = simpleDateFormat.parse("1980-12-30");
            statement.setDate(3,new java.sql.Date(date.getTime()));

            //执行操作
            int i = statement.executeUpdate();
            if (i == 1){
                System.out.println("执行成功");
            }else {
                System.out.println("执行失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //资源的关闭
            try {
                if (statement != null){
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


    @Test
    public void testUpdate()  {
        /**
         * @description: 向数据库中更新一条数据
          * @param
         * @return: void
         * @author: CuiMingming
         * @date: 2020-01-08 16:47
         */
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            //获取数据库的连接
            connection = JDBCUtil.getConnection();

            //预编译sql语句
            String sql = "update customers set name = ? where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            //填充占位符
            preparedStatement.setString(1, "赵敏");
            preparedStatement.setInt(2, 9);

            //执行sql
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //资源关闭
            JDBCUtil.closeResource(connection, preparedStatement);
        }

    }
}
