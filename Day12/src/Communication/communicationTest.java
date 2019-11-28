package Communication;

/**
 * @Author: MingmingCui
 * @Description:    线程通信
 * @Date:13:46 2019-11-28
 */

/*
* 涉及到的方法：
* 1、wait（）：调用此方法，则当前线程进入阻塞状态，并释放同步锁
* 2、notify（）：一旦调用此方法，则就会唤醒wait（）的一个线程，如果多个线程，则唤醒较高级的线程
* 3、notifyAll（）：一旦调用此方法，则唤醒所有线程
*
* 说明：
* 1、wait（）、notify（）、notifyAll（）都必须在同步代码块中或同步方法中使用
* 2、三个方法的调用者必须是同步代码块或同步方法中的同步监视器
* 3、
*
*
*
* */
public class communicationTest {
    public static void main(String args[]) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);
        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();


    }

}

class Number implements Runnable{
    private int number = 1;
    @Override
    public void run() {
        while (true){

            synchronized (this) {
                //唤醒另外一个线程，如果使用notifyAll（）则唤醒所有线程
                notify();

                if (number <= 100){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;

                    try {
                        //使得调用wait的线程，进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else {
                    break;
                }
            }

        }
    }
}
