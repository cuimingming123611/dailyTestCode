package method1;

import method1.Window1;

/**
 * @Author: MingmingCui
 * @Description:  线程安全问题
 * @Date:17:07 2019-11-27
 */

public class WindowTest  {
    public static void main(String args[]) {
             Window1 w = new Window1();
             Thread t1 = new Thread(w);
             Thread t2 = new Thread(w);
             Thread t3 = new Thread(w);
             t1.setName("窗口1");
             t2.setName("窗口2");
             t3.setName("窗口3");

             t1.start();
             t2.start();
             t3.start();

    }
}
