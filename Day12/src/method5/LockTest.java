package method5;

import javax.swing.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: MingmingCui
 * @Description: lock同步线程的方法
 * @Date:09:54 2019-11-28
 */
public class LockTest {
    public static void main(String args[]) {
        Window window = new Window();
        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        Thread t3 = new Thread(window);
         t1.setName("窗1");
         t2.setName("窗2");
         t3.setName("窗3");

         t1.start();
         t2.start();
         t3.start();
    }

}

class Window implements Runnable{
    //1、实例化lock
     private ReentrantLock lock = new ReentrantLock(true);



    private static int ticket =100;
    @Override
    public void run() {
        while (true){
            //2、调用lock（）

            try {
                lock.lock();
                if (ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":售票，票号为："+ticket);
                    ticket--;
                }else {
                    break;
                }
            }finally {
                //3、调用解锁
                lock.unlock();
            }

        }
    }
}

