package recursion;

/**
 * @Author: MingmingCui
 * @Description: 递归方法的测试
 * @Date:11:39 2019-11-18
 */

/*
* 递归方法：一个方法内调用它自身
*
*
* */
public class Recursion {

    public static void main(String args[]) {
             Recursion recursion = new Recursion();
             System.out.println(recursion.getSum(5));

             System.out.println(recursion.fibonacc(10));

    }

    public int getSum(int n){
        
        /** 
        * @Description: 计算1-n以内的自然数的总和
         * @param n 
        * @return: int 
        * @Author: MingmingCui
        * @Date: 2019-11-18 11:45
        */
        if (n == 1){
            return n;
        }else {
            return n + getSum(n -1);
        }
    }

    //已知一个数列，f（0）= 1，f（1） = 4，f（n+2）= 2*f（n+1）+f(n)
    //求f(10)
    public int f(int n){
        if (n == 0){
            return 1;
        }else if (n == 1){
            return 4;
        }else {
            return 2*f(n-1)+f(n-2);
        }
    }

    //斐波那契数列
    public int fibonacc(int n){
        if (n == 0){
            return 1;
        }else if (n == 1){
            return 1;
        }else if (n == 2){
            return 2;
        }else {
            return fibonacc(n-1)+fibonacc(n-2);
        }
    }

}
