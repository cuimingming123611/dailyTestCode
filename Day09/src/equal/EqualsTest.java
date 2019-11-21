package equal;


/**
 * @Author: MingmingCui
 * @Description: equal（）方法的测试与重写
 * @Date:12:10 2019-11-21
 */
public class EqualsTest {


    public static void main(String args[]) {
        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2); //true

        //引用类型
        Customer customer = new Customer("张三", 26);
        Customer customer2 = new Customer("张三", 26);
        System.out.println(customer == customer2); //false

        String str1 = new String("atguigu");
        String str2 = new String("atguigu");
        System.out.println(str1 == str2);//false

        System.out.println("***************************");
        //Object类中equal（）的方法代码如下：
       /* public boolean equals(Object obj) {
            return (this == obj);
        }*/
        //相等与使用了 ==
        System.out.println(customer.equals(customer2)); //false ,使用了Customer重写的equal（）方法后，就变成true
        System.out.println(str1.equals(str2)); //true
        //String类中的equal（）方法被重写了，重写的方法如下：
        /*public boolean equals(Object anObject) {
            if (this == anObject) {
                return true;
            }
            if (anObject instanceof String) {
                String anotherString = (String)anObject;
                int n = value.length;
                if (n == anotherString.value.length) {
                    char v1[] = value;
                    char v2[] = anotherString.value;
                    int i = 0;
                    while (n-- != 0) {
                        if (v1[i] != v2[i])
                            return false;
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }*/

        //如何判断Customer两个对象的实体内容是否相等？
        //自定义类如何重写equal（）的方法？需要重写Object类中的equal（）方法重写
        System.out.println("***********************");
        System.out.println(customer.toString());



    }
}
