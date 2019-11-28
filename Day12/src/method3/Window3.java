package method3;

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
public class Window3 implements Runnable {
    private static int ticket = 100;
    //private  static Object object = new Object();

    @Override
    public void run() {
        while (true) {
            show();
            }
        }
    private  synchronized void show(){ //同步监视器为this
        if (ticket > 0) {
            //休眠100毫秒，使得线程阻塞
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket--;
        }
    }
}
