import java.util.Calendar;
import java.util.Date;

/**
 * @Author: MingmingCui
 * @Description: 日历类(抽象类)
 * @Date:17:28 2019-12-03
 */
public class CalendarTest {
    public static void main(String args[]) {
        CalendarTest calendarTest = new CalendarTest();
        calendarTest.testCalendar();
    }



    public void testCalendar(){
        //实例化
        //方式一：使用静态方法
        Calendar calendar = Calendar.getInstance();


        //常用方法
        //get()
        int days = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(days);//这个月的第几天
        System.out.println(calendar.get(calendar.DAY_OF_YEAR));//这一年的第几天


        //set()
        calendar.set(calendar.DAY_OF_MONTH,12);
        days = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(days);

        //add()
        calendar.add(calendar.DAY_OF_MONTH,3);
        days = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(days);


        //getTime()
        Date time = calendar.getTime();
        System.out.println(time);


        //setTime()
        Date date = new Date();
        calendar.setTime(date);
        days = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(days);


    }

}
