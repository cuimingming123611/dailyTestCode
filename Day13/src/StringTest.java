/**
 * @Author: MingmingCui
 * @Description:
 * @Date:09:57 2019-11-29
 */


/*
1、sting声明为final，不可继承
 2、string实现了serializable接口：表示字符串支持序列化
          实现了comparable接口，表示string可以比较大小
 3、string内部定义了final char[] value用于存储字符串数据
 4、string：代表不可变的字符序列
       1）当对字符串进行重新赋值使，需要重写指定内存区域赋值，不能使用原有的value进行赋值
       2）当对现有字符串进行连接操作时，也许要重新指定内存赋值，不能使用原有的value进行赋值
       3）当调用string的replace（）方法修改指定字符串时，也需要重新指定内存赋值，

*/

public class StringTest {
    public static void main(String args[]) {
      /*    String s6 = "abc";
        String s8 = s6.replace("a", "m");
        System.out.println(s6);
        System.out.println(s8);
    */
        System.out.println("**********************");

        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE"+"hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE"+ s2;
        String s7 = s1+ s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false
        //常量与常量的拼接结果在常量池，且常量池中不会存在相同内容的常量
        //要有其中有一个是变量，结果就在堆中

        String s8 = s5.intern();
        System.out.println(s3 == s8);//true
        //调用intern（）方法，返回的值放在常量池中


    }

}
