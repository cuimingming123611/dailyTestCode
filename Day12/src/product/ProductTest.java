package product;

/**
 * @Author: MingmingCui
 * @Description:  生产者与消费者应用，线程的应用
 * @Date:14:10 2019-11-28
 */


/*
* 1、多线程
* 2、线程安全的问题，是否有共享数据？产品数量
* 3、如何解决线程安全问题？同步机制
* 4、线程通信
* */
public class ProductTest {
    public static void main(String args[]) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");

        Consumer c1 = new Consumer(clerk);
        c1.setName("消费者1");
        Consumer c2 = new Consumer(clerk);
        c2.setName("消费者2");


        p1.start();
        c1.start();
        c2.start();
    }

}

