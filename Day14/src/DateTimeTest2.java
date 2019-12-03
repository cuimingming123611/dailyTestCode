import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: MingmingCui
 * @Description:  三天打鱼两天晒网  练习
 * @Date:16:16 2019-12-03
 */
public class DateTimeTest2 {
    public static void main(String args[]) throws ParseException {
        DateTimeTest2 dateTimeTest2 = new DateTimeTest2();
        String string = dateTimeTest2.doWhat("2019-01-01");
        System.out.println(string);
    }

    public String doWhat(String  string) throws ParseException {
        String Date = "1990-01-01";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd");
        Date startDate = simpleDateFormat.parse(Date);
        Date endDate = simpleDateFormat.parse(string);
        String result = "";
        long endDateStamp = endDate.getTime();
        long startDateStamp = startDate.getTime();
        long sum = endDateStamp - startDateStamp;
        long days = sum/(1000*60*60*24);
        if (days >= 0){
            int number = (int)(days % 5);
            switch (number){
                case 1:
                case 2:
                case 3:
                    result = "今天在打鱼";
                    break;
                case 4:
                case 0:
                    result = "今天在晒网";
            }
        }else {
            result =  "今天不知道你在干嘛";
        }
        return result;
    }
}
