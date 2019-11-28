package exercise;

/**
 * @Author: MingmingCui
 * @Description:  演示死锁的现象
 * @Date:18:20 2019-11-27
 */


/*
*
*
* 1、不同的线程分别占用对方需要同步资源不放弃，都在等待对方放弃，造成线程的死锁
* 2、
*
* */
public class ThreadTest {
    public static void main(String args[]) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
          new Thread(){
              @Override
              public void run() {
                synchronized (s1){
                    s1.append("a");
                    s2.append("1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s2){
                        s1.append("b");
                        s2.append("2");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
              }
          }.start();


          new Thread(new Runnable() {
              @Override
              public void run() {
                  synchronized (s2){
                      s1.append("c");
                      s2.append("3");

                      try {
                          Thread.sleep(100);
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }

                      synchronized (s1){
                          s1.append("d");
                          s2.append("4");
                          System.out.println(s1);
                          System.out.println(s2);
                      }
                  }
              }
          }){

          }.start();
    }
}
