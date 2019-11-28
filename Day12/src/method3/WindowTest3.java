package method3;

/**
 * @Author: MingmingCui
 * @Description:  
 * @Date:17:42 2019-11-27
 */
public class WindowTest3 {
    public static void main(String args[]) {
        Window3 w = new Window3();
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
