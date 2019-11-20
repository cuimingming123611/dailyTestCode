package super_use;

/**
 * @Author: MingmingCui
 * @Description: super关键字的使用
 * @Date:15:51 2019-11-20
 */
public class Person {
    String name;
    int age;
    int id ;//身份证号码

    public Person(){

    }
    public Person(String name, int age,int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void eat(){
        System.out.println("人，吃饭");
    }
    public void walk(){
        System.out.println("人，走路");
    }
}
