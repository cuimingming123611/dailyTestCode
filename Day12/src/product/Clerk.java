package product;

/**
 * @Author: MingmingCui
 * @Description: 店员
 * @Date:14:13 2019-11-28
 */
public class Clerk {
    private int productCount = 0;

    public synchronized void produceProduct() {

        /**
        * @Description: 生产产品
         * @param
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-28 14:24
        */
        if (productCount < 10){
            productCount++;
            System.out.println(Thread.currentThread().getName()+":开始生产第"+productCount+"个产品。");
            notify();
        }else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void consumeProduct() {

        /**
        * @Description: 销售产品
         * @param
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-28 14:24
        */
        if (productCount > 0){
            System.out.println(Thread.currentThread().getName()+":开始消费第"+productCount+"个产品");
            productCount--;
            if (productCount < 5){
                notify();
            }

        }else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
