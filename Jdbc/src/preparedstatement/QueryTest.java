package preparedstatement;

import bean.Customer;

import java.util.List;

/**
 * @author: CuiMingming
 * @Description:
 * @date: 2020-01-09 13:57
 */
public class QueryTest {
    public static void main(String args[]) {
        String sql = "select `id`,name,email,birth from customers where id = ?";
        Object instance = Query.getInstance(Customer.class, sql, 1);
        System.out.println(instance);


        System.out.println("********************************************************");
        String sql2 = "select id , name , email,birth from customers where id > ?";
        List<Customer> customers = QueryList.QueryList(Customer.class, sql2, 1);
        customers.forEach(System.out::println);
    }
}
