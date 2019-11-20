package super_use;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:15:52 2019-11-20
 */
public class Student extends Person{
    String major;
    int id;//学号号码

    public Student(String major, int id) {
        this.major = major;
        this.id = id;
    }

    public Student(String name, int age, String major, int id) {
        //相当于调用了Person类中public Person(String name, int age) {}的构造器
        super(name, age,id);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生，多吃有营养的东西！");
    }

    public void study(){
        System.out.println("学生，学习知识！");
    }

    public void show(){
        System.out.println("name = "+name +" age  = "+age);
        //super. 调用的是父类的id的属性（通常情况下，不会声明同名的变量名）
        System.out.println("身份证号码为："+super.id+" 学号号码为："+id);
        System.out.println("专业为："+major);
    }
}
