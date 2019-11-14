package excited;

/**
 * @description: 用第二种方式实现自动生成数字，放入数组，并且不与其他数重复
 * @version: V0.2
 * @author: cuimingming
 * @data 2019/11/14 0014 下午 10:22
 */
public class ArrayDemo3 {
    public static void main(String[] args){
        int[] arr = new int[10];
        for (int i = 0;i <arr.length;i++){
            arr[i] =(int)(Math.random()*30+1);
            for (int j = 0;j<i;j++){
                if (arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
        }
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
