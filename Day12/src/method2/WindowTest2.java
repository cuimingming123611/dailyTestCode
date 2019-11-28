package method2;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:17:42 2019-11-27
 */
public class WindowTest2 {
    public static void main(String args[]) {
        Window2 w1 = new Window2();
        Window2 w2 = new Window2();
        Window2 w3 = new Window2();
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();

    }
}
