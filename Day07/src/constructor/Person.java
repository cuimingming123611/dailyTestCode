package constructor;

/**
 * @Author: MingmingCui
 * @Description:  构造器的内容讲解
 * @Date:16:44 2019-11-18
 */


/*
* 1、构造器：constructor
* 一、构造器的作用：
*   1、创建对象
*   2、初始化对象的属性 ：例如人一出生就必须洗过澡，则就可以使用构造器，完成初始化
*
*二、说明：
* 1、如果没有显式的定义累的构造器的话，则系统默认提供一个空参的构造器
* 2、定义构造器的格式：权限修饰符 类名（形参列表）
* 3、一个类中，定义多个构造器，则构成重载
* 4、一旦显式的定义了类的构造器以后，系统就不在提供默认的空参构造器
* 5、一个类中，至少有一个构造器
*
*
* 三、属性赋值的先后顺序
*  1、默认初始化值
*  2、显式初始化
*  3、构造器初始化
*  （1-3只能执行一次，4可以执行多次）
*  4、对象.方法 或者 对象.属性
*
*
* 四、关键字this
*  1、this可以用来修饰：属性、方法、构造器
*  2、this 表示当前的对象
*  3、在类的方法中，通常"this.属性/方法"中的"this."是可以省略的，特殊情况不省略：当方法的形参和类的属性同名时，
*  我们必须显式的使用"this.属性"的方式，表明此变量是属性而非形参。
*  4、this调用构造器
*       在类的构造器中，可以显式使用"this(形参列表)"的方式，调用本类中的其它的构造器
*       规定：this(形参列表)必须声明在当前构造器的首行
*       构造器内部，最多只能声明一个this(形参列表)
* */
public class Person {
    private String name;
    private int age;

    //默认的构造器 ,如果定了其它的构造器，则默认的构造器就必须申明
    public  Person(){
        System.out.println("person初始化内容，需要用40行代码实现！");
    }
    //带形参列表的构造器
    //this()表示调用Person（）构造器
    public Person(String name){
        this();
        this.name = name;
    }
    //this()表示调用Person(String name)的构造器
    public Person(String name,int age){
        this(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }
    public void study(){
        System.out.println("学习");
    }
}
