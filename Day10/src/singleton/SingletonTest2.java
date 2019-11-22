package singleton;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:11:32 2019-11-22
 */
public class SingletonTest2 {
    public static void main(String args[]) {
            Order order =Order.getInstance();
            Order order1 =Order.getInstance();
            System.out.println(order == order1);
    }
}
class Order{
    //1、私有化构造器
    private Order() {
    }
    //2、声明当前类对象，没有初始化
    //4、此对象类必须声明为static的
    private static Order order = null;
    //3、声明public、static的返回当前类对象的方法
    public static Order getInstance(){
        if (order == null){
            order = new Order();
        }
        return order;
    }
}
