import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: MingmingCui
 * @Description: 日期和时间的api测试
 * @Date:11:43 2019-12-02
 */


/*
 * 1、System.currentTimeMillis() 时间戳
 * 2、java.util.Date 和 java.sql.Date
 * 3、simpleDateFormat 日期格式化
 *
 *
 * */
public class DateTimeTest {
    public static void main(String args[]) {

        //util下的Date（）
        //返回时间戳
        long time = System.currentTimeMillis();
        System.out.println(time);

        //Date
        //空参构造器，代表当前时间
        Date date = new Date();
        //显示当前的年月日时分秒
        System.out.println(date.toString());
        //返回时间戳
        System.out.println(date.getTime());

        //sql下的Date
        java.sql.Date date1 = new java.sql.Date(4423423534535334234l);
        System.out.println(date1.toString());

        //将util的转为sql
        Date date2 = new Date();
        java.sql.Date date3 = new java.sql.Date(date2.getTime());
        System.out.println(date3);

        System.out.println("*****************************");

        DateTimeTest dateTimeTest = new DateTimeTest();
        dateTimeTest.testSimpleDateFormat();
        dateTimeTest.testExer();
    }

    public void testSimpleDateFormat() {
        //创建对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        //格式化日期
        Date date = new Date();
        System.out.println(date);
        //得到字符串的时间
        String format = simpleDateFormat.format(date);
        System.out.println(format);


        //解析:将字符串-》日期
        String string = "19-12-3 下午4:23";
        try {
            Date parse = simpleDateFormat.parse(string);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //    使用自定义格式的形参的构造器
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = simpleDateFormat1.format(date);
        System.out.println(format1);

        try {
            Date parse = simpleDateFormat1.parse(format1);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //将2020-09-08 转化为sql.date格式
    public void testExer() {
        System.out.println("****************************");
        String string = "2020-09-08";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd");
        try {
            Date birthDate = simpleDateFormat.parse(string);
            System.out.println(birthDate);
            //转化为sql.date类型
            java.sql.Date date = new java.sql.Date(birthDate.getTime());
            System.out.println(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


}
