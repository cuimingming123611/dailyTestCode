package interfacepage;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:16:36 2019-11-22
 */
public class InterfaceTest {
    public static void main(String args[]) {
    Plan plan = new Plan();
    plan.fly();
    plan.stop();
    }
}
interface Fly{

    //全局常量
    //省略了public static final
     int MAX_SPEED = 7900;
     int MIN_SPEED = 1;

     //抽象方法
    //省略了public abstract
     void fly();
     void stop();

}
interface Attack{
    void attack();
}

class Plan implements Fly{

    @Override
    public void fly() {
        System.out.println("飞机通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("机长来操作，使飞机停止");
    }
}


class Bullte implements Fly,Attack{
    @Override
    public void fly() {
        System.out.println("子弹靠枪起飞");
    }

    @Override
    public void stop() {
    System.out.println("子弹靠撞击停止");
    }

    @Override
    public void attack() {
        System.out.println("子弹可以射击目标");
    }
}
//**************************************************
//接口之间的继承
interface AA{

}
interface BB{

}

interface CC extends AA,BB{

}

