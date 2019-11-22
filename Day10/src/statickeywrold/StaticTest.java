package statickeywrold;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:09:53 2019-11-22
 */

/*
* 1、static : 静态的
* 2、static可修饰：属性、方法、代码块、内部类
* 3、修饰属性：
*   3.1 变量按是否使用static修饰，又分为：静态属性(类变量)和非静态属性（实例变量）
*   静态变量：多个对象共享同一个静态变量，修改静态变量，导致每个对象的静态变量都是会被修改
*   3.2 说明：
*       a、静态变量随着类的加载而加载，可以通过"类.静态变量"进行调用
*       b、静态变量的加载要早于对象的创建
*       c、静态变量在内存中只存在一次
*
*
* 4、修饰方法：静态方法
*       a、随着类的加载而加载，可以通过"类.静态方法"进行调用
*       b、静态方法中，只能调用静态方法和静态属性
*       c、非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法和属性
*       d、在静态方法中，不能使用this、super关键字
* */
public class StaticTest {
    public static void main(String args[]) {
        Chinese chinese = new Chinese();
        chinese.name = "姚明";
        chinese.age = 35;
        chinese.nation = "中国";


        Chinese chinese1 = new Chinese();
        chinese1.name = "崔明明";
        chinese1.age = 26;
        chinese1.nation = "中国2";
        System.out.println("chinese1的国籍："+chinese1.nation);
        System.out.println("chinese的国籍："+chinese.nation);

    }
}
class Chinese{
    String name;
    int age;
    static String nation;
    public void eat(){
        System.out.println("人吃饭");
    }

    public static void show(){
        //静态方法只能调用静态变量和静态方法
        System.out.println("我是一个中国人");
        System.out.println(nation);
        walk();

    }
    public static void walk(){

    }
    public void allInfo(){
        //非静态方法即可以调用静态方法和属性
        show();
        System.out.println(nation);
        //也可以调用静态方法和属性
        this.eat();

    }
}