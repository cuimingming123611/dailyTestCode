package block;

/**
 * @Author: MingmingCui
 * @Description: 代码块的学习
 * @Date:11:56 2019-11-22
 */
public class BlockTest {
    public static void main(String args[]) {
        String str = Person.desc;
    }
}
class Person{
    //属性
    private String name;
    private int age;
    public static String desc = "我是一个人";

    //代码块
    static {
        System.out.println("静态代码块");
        //可以调用静态属性和静态方法
        desc = "我是一个快乐的人！！！";
        walk();

    }

    {
        System.out.println("非静态代码块");
        //可以调用静态和非静态的方法和属性

    }




    //构造器
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //方法
    public void eat(){
        System.out.println("吃饭!");
    }
    public static void walk(){
        System.out.println("人是走路的！");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
