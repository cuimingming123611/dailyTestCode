package template_exercise;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:16:08 2019-11-22
 */
public class PayrollSystem {
    public static void main(String args[]) {
        //控制台输入获得月份
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("请输入当前的月份：");
        int month = scanner.nextInt();*/
        //常用类
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);
        //声明的是数组
      Employee[] employees = new Employee[2];
      //使用多态添加数组元素
      employees[0] = new SalariedEmployee("马森",1002,new MyDate(1992,10,28),2000);
      employees[1] = new HourlyEmployee("马克",1003,new MyDate(1991,5,6),50,240);

        for (int i = 0; i <employees.length ; i++) {
            System.out.println(employees[i]);
            double salary = employees[i].earnings();
            System.out.println("月工资为："+salary);
            if (month == employees[i].getBirthday().getMonth()){
                System.out.println("生日快乐！奖励工资100元！");
            }

        }
    }
}
