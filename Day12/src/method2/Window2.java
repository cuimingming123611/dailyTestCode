package method2;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:17:43 2019-11-27
 */

/*
* 解决继承Thread导致线程安全的问题：
* 1、将总数量设置为static
* 2、将监视器（锁）设置为static
*
* */
public class Window2 extends Thread {
    private static int ticket = 100;
    //private  static Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (Window2.class) { //Window4.class充当对象
                if (ticket > 0) {
                    //休眠100毫秒，使得线程阻塞
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
