package singleton;

/**
 * @Author: MingmingCui
 * @Description: 单例模式
 * @Date:11:25 2019-11-22
 */
/*
* 单例设计模式：某个类只能存在一个对象实例
*
*
*
*
* */
public class SingletonTest {
    public static void main(String args[]) {
        Bank bank = Bank.getInstance();
    }

}
//饿汉式实现
class Bank{

    //1、私有化构造器
    private Bank() {

    }
    //2、内部创建类的对象
    //4、要求此对象也必须声明为静态的
   private  static Bank instance = new Bank();
    //3、提供公共的静态方法，返回对象

    public static Bank getInstance() {
        return instance;
    }
}