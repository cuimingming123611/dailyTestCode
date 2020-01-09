package preparedstatement;

import bean.Order;
import com.sun.tools.corba.se.idl.constExpr.Or;
import util.JDBCUtil;

import java.lang.reflect.Field;
import java.sql.*;

/**
 * @author: CuiMingming
 * @Description:
 * @date: 2020-01-09 11:26
 */
public class OrderForQuery {
    public static void main(String args[]) {

        OrderForQuery orderForQuery = new OrderForQuery();
        /*orderForQuery.testOrderQuery();*/


        //定义别名，使的列的名称与类对象的属性名相同，通过反射的方式，实现赋值
        String sql = "select order_id orderId, order_name  orderName,order_date  orderData from `order` where order_id = ?";
        Order order = orderForQuery.orderForQuery(sql, 1);
        System.out.println(order);

    }
    public Order orderForQuery(String sql,Object ...args) {
        /**
         * @description: order 表通用的查询方法
          * @param
         * @return: void
         * @author: CuiMingming
         * @date: 2020-01-09 11:44
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
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            if (resultSet.next()){
                Order order = new Order();
                for (int i = 0;i<columnCount;i++){
                    //通过结果集获得列的值
                    Object columnValue = resultSet.getObject(i + 1);

                    //通过元数据获得列的别名：getColumnLabel
                    String columnLabel = metaData.getColumnLabel(i+1 );

                    //通过反射，将对象指定名columnName的属性赋值columnValue
                    Field declaredField = Order.class.getDeclaredField(columnLabel);
                    declaredField.setAccessible(true);
                    declaredField.set(order, columnValue);

                }
                return order;

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeResource(connection, preparedStatement,resultSet);
        }

        return null;

    }



    public void testOrderQuery() {
        /**
         * @description: 非通用的order表查询方法
          * @param
         * @return: void
         * @author: CuiMingming
         * @date: 2020-01-09 11:43
         */
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "select order_id,order_name,order_date from `order` where order_id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, 1);

            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                int id = (int) resultSet.getObject(1);
                String orderName = (String) resultSet.getObject(2);
                Date data = (Date) resultSet.getObject(3);

                Order order = new Order(id, orderName, data);
                System.out.println(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeResource(connection,preparedStatement,resultSet);
        }

    }
}
