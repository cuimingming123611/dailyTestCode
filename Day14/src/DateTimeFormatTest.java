import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @Author: MingmingCui
 * @Description:  格式化解析日期或时间
 * @Date:18:26 2019-12-03
 */
public class DateTimeFormatTest {
    public static void main(String args[]) {
        DateTimeFormatTest dateTimeFormatTest = new DateTimeFormatTest();
        dateTimeFormatTest.test();
    }


    public void test(){
        //方式一：预定义
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime dateTime = LocalDateTime.now();
        //格式化：日期-》字符串
        String format = formatter.format(dateTime);
        System.out.println(format);
        //解析
        TemporalAccessor parse = formatter.parse("2019-12-03T18:30:47.866");
        System.out.println(parse);

        //方式二：本地化相关格式
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        String format1 = formatter1.format(dateTime);
        System.out.println(format1);


        //方式三： 自定义
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyy-MM-dd hh:mm:ss");
        String format2 = formatter2.format(LocalDateTime.now());
        System.out.println(format2);
        TemporalAccessor parse1 = formatter2.parse("2019-12-03 06:38:57");
        System.out.println(parse1);


    }



}
