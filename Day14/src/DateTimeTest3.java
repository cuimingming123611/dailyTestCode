import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:18:15 2019-12-03
 */
public class DateTimeTest3 {
    public static void main(String args[]) {
        DateTimeTest3 dateTimeTest3 = new DateTimeTest3();
        dateTimeTest3.test2();
        System.out.println("***************");
        dateTimeTest3.test();
    }

    public void test2(){
        Instant instant = Instant.now();
        System.out.println(instant);
        //设置时区的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);


        //获取时间戳
        long epochMilli = instant.toEpochMilli();
        System.out.println(epochMilli);

        //用时间戳转换为时间
        Instant instant1 = Instant.ofEpochMilli(epochMilli);
        System.out.println(instant1);


    }
    public void test(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //getXXX()
        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println(dayOfMonth);
        //withXXX()
        LocalDateTime localDateTime1 = localDateTime.withDayOfMonth(12);
        System.out.println(localDateTime1);
        //加上
        LocalDateTime localDateTime2 = localDateTime.plusMonths(3);
        System.out.println(localDateTime2);
        //减去
        LocalDateTime localDateTime3 = localDateTime.minusMonths(3);
        System.out.println(localDateTime3);
    }
}
