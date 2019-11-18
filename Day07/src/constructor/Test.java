package constructor;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:16:48 2019-11-18
 */
public class Test {
    public static void main(String args[]) {
        //创建类的对象
        //Person()就是构造器
        Person person = new Person("张三");
        System.out.println(person.getAge());

        System.out.println();
        //计算三角形面积

        //方法一：使用默认构造器构造
        TriAngle triAngle = new TriAngle();
        triAngle.setBase(3.0);
        triAngle.setHeight(6.8);
        System.out.println("三角形的底边长："+triAngle.getBase()+" ，高为:"+triAngle.getHeight());

        System.out.println();
        //方法二：使用带形参列表的构造器构造，直接设置三角形的底边长和高

        TriAngle triAngle2 = new TriAngle(2.5,5.0);
        System.out.println("三角形的底边长："+triAngle2.getBase()+" ，高为:"+triAngle2.getHeight());

    }
}
