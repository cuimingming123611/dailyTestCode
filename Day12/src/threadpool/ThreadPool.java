package threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: MingmingCui
 * @Description: 使用线程池
 * @Date:15:42 2019-11-28
 */
public class ThreadPool {
    public static void main(String args[]) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service = (ThreadPoolExecutor) executorService;
        //设置线程池的属性
        service.setCorePoolSize(10);
        //service.setKeepAliveTime(100,);

        service.submit(new NumThread());//适合于使用callable
        service.submit(new NumThread1());//适合于使用callable
        //executorService.execute();//适合于使用runnable

        executorService.shutdown();//关系连接池
    }
}

class NumThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i%2 == 0){
                System.out.println(Thread.currentThread().getName() + ":"+i);
            }
        }
    }
}

class NumThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i%2 != 0){
                System.out.println(Thread.currentThread().getName() + ":"+i);
            }
        }
    }
}