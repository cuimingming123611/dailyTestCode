/**
 * @Author: MingmingCui
 * @Description: 面向对象的编程思想
 * @Date:10:26 2019-11-15
 */
/*
*属性 = 成员变量 = field = 字段
*方法 = 成员方法 = 函数  =  method
*创建类的对象 = 类的实例化 = 实例化类
*
*类的对象的使用（面向对象思想落地）
*1、创建类、设计类的成员
* 2、创建类对象
* 3、通过 对象.属性 或 对象.方法 调用对象的结构
* */
public class Person {
    public static void main(String args[]) {
    //实例化类
        Person person = new Person();
        person.name = "崔明明";
        person.age = 27;
        person.isMale = true;
        System.out.println("姓名为："+person.name+";年龄为"+person.age+";是否为男性？"+person.isMale);
        person.eat();
        person.sleep();
        person.talk("chinese");

    }

    //成员变量
    String name;
    int age;
    boolean isMale;

    //成员方法
    public void eat(){
        System.out.println("人是可以吃东西的！");
    }
    public void sleep(){
        System.out.println("人是需要睡觉的！");
    }
    public void talk(String language){
        System.out.println("人是使用"+language+"语言进行交流的！");
    }



}