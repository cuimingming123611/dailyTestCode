package preparedstatement;

import bean.Customer;
import org.junit.Test;
import util.JDBCUtil;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.*;

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

    public Customer queryForCustomer(String sql,Object ...args) {
        /** 
         * @description: 针对customer表的通用查询操作
          * @param  
         * @return: void 
         * @author: CuiMingming
         * @date: 2020-01-09 09:11
         */
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

            //获取结果集的元数据
            ResultSetMetaData metaData = resultSet.getMetaData();

            //通过元数据获得结果集中的列数
            int columnCount = metaData.getColumnCount();
            if (resultSet.next()){
                //造一个customer对象
                Customer customer = new Customer();
                for (int i = 0;i<columnCount;i++){
                    //获得每列的value
                    Object columnValue = resultSet.getObject(i + 1);

                    //获取每个列的列名
                    String columnName = metaData.getColumnName(i + 1);

                    //给customer对象指定的某个属性，赋值为value:通过反射
                    Field field = Customer.class.getDeclaredField(columnName);
                    field.setAccessible(true);
                    field.set(customer, columnValue);
                }
                return customer;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeResource(connection, preparedStatement,resultSet);
        }
        return null;
    }


    @Test
    public void testQueryForCustomer(){
        String sql="select id , name ,email,birth from customers where id = ?";
        Customer customer = queryForCustomer(sql, 2);
        System.out.println(customer);
    }


}
