package abstractpage;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:14:51 2019-11-22
 */
public class EmployeeTest {
    public static void main(String args[]) {
        Employee employee = new Manager("张三",23344,2000.00,500);
        employee.work();

        Employee employee1 = new CommonEmployee();
        employee1.work();
    }
}
