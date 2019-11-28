package method1;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:17:07 2019-11-27
 */
/*
 * 1、问题：出现重票和错票
 * 2、原因：当某个线程操作卖票的过程中，尚未操作完成，其它线程也参与进来，也操作车票
 * 3、解决：当一个线程在操作共享数据（ticket）时，其它线程不能参与，直接当前线程操作完，其它线程才能操作
 * 4、java：java通过同步线程的方式解决
 *
 * 方式一：同步代码块
 * synchronized（同步监视器）{
 * //需要被同步的代码，操作共享数据的代码
 * }
 * a、同步监视器：俗称"锁"，任何一个类的对象，都可以充当锁
 * b、要求多个线程必须公用同一个锁
 *
 *
 * 方式二：同步方法
 *
 * */
public class Window1 implements Runnable {
    private int ticket = 100;
    //Object object  = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (this){ //this代表当前对象，w 唯一的对象
                if (ticket > 0){
                    //休眠100毫秒，使得线程阻塞
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":卖票，票号为："+ticket);
                    ticket--;
                }else {
                    break;
                }
            }

        }
    }
}
