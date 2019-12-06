package exercise;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author: CuiMingming
 * @Description:
 * @date: 2019-12-06 15:54
 */
public class EmployeeTest {

    Employee e1 = new Employee("liudehua", 54, new MyDate(1965, 10, 06));
    Employee e2 = new Employee("zhangxueyou", 50, new MyDate(1987, 10, 06));
    Employee e3 = new Employee("guofucheng", 44, new MyDate(1956, 10, 06));
    Employee e4 = new Employee("liming", 56, new MyDate(1987, 10, 06));
    Employee e5 = new Employee("liangchaowei", 60, new MyDate(1965, 10, 07));

    TreeSet<Employee> employees = new TreeSet<>();
    //自然排序
    @Test
    public void test(){


        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
       // System.out.println(employees);
        EmployeeTest employeeTest = new EmployeeTest();
        employeeTest.forEachMethod(employees);


    }
    //按生日排序
    @Test
    public void test2(){
        TreeSet<Employee> employees = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                    MyDate birthday = o1.getBirthday();
                    MyDate birthday1 =o2.getBirthday();
                    //比较年
                    return birthday.compareTo(birthday1);

            }
        });

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        // System.out.println(employees);
        EmployeeTest employeeTest = new EmployeeTest();
        employeeTest.forEachMethod(employees);




    }

    public void forEachMethod(Object o){
        if (o instanceof TreeSet){
            TreeSet treeSet = (TreeSet) o;
            Iterator iterator = treeSet.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }

    }
}
