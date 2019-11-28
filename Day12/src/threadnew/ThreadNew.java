package threadnew;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: MingmingCui
 * @Description:  实现Callable接口，创建多线程
 * @Date:15:23 2019-11-28
 */
public class ThreadNew {
    public static void main(String args[]) {
            NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask(numThread);
         new Thread(futureTask).start();
        try {
            //get的返回值即为FutureTask构造器参数callable实现类重写call的返回值
            Object sum = futureTask.get();
            System.out.println("总和为："+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}


class NumThread implements Callable{
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i%2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}