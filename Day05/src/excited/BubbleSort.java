package excited;

/**
 * @Author: MingmingCui
 * @Description: 冒泡排序
 * @Date:09:05 2019-11-15
 */
public class BubbleSort {
    public static void main(String args[]) {
       int[] arr = new int[]{65,23,589,69,40,384,30,68,12,17,3};
       for (int i = 0 ;i < arr.length;i++){
           for (int j = 1;j < arr.length - 1 -i;j++){
               if (arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
    }
}
