package preparedstatement;

import bean.Customer;
import org.junit.Test;
import util.JDBCUtil;

import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author: CuiMingming
 * @Description: 针对某个表的查询
 * @date: 2020-01-08 18:00
 */
public class CustomerForQuery {
    @Test
    public void testQuery() {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "select * from  customers where id = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, 1);

            //执行并返回resultSet结果集
            resultSet = preparedStatement.executeQuery();
            //处理结果集
            if (resultSet.next()) {        //判断结果集下一条是否有数据，如果有数据，返回true并指针下移，如果没有数据，返回false并退出
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String email = resultSet.getString(3);
                Date date = resultSet.getDate(4);

                System.out.println(id + " " + name + " " + email + " " + date);

                //封装为一个对象
                Customer customer = new Customer(id, name, email, date);
                System.out.println(customer.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeResource(connection, preparedStatement, resultSet);
        }


    }

}
