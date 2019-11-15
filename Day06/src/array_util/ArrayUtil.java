package array_util;

/**
 * @Author: MingmingCui
 * @Description: 整合数组的方法：
 * @Date:17:36 2019-11-15
 */
public class ArrayUtil {

    public int getMax(int[] arr){

        /**
        * @Description: 获取数组中的最大值
         * @param arr
        * @return: int
        * @Author: MingmingCui
        * @Date: 2019-11-15 17:37
        */
        int maxNumber = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (arr[i] > maxNumber){
                maxNumber = arr[i];
            }
        }

        return maxNumber;
    }

    public int getMin(int[] arr){

        /**
        * @Description: 获取数组中最小的值
         * @param arr
        * @return: int
        * @Author: MingmingCui
        * @Date: 2019-11-15 17:44
        */
        int minNumber = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (arr[i] < minNumber){
                minNumber = arr[i];
            }
        }

        return minNumber;

    }


    public int sum(int[] arr){

        /**
        * @Description: 求数组的综合
         * @param arr
        * @return: int
        * @Author: MingmingCui
        * @Date: 2019-11-15 17:47
        */
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    public double avg(int[] arr){

        /**
        * @Description:  求数组的平均数
         * @param arr
        * @return: double
        * @Author: MingmingCui
        * @Date: 2019-11-15 17:48
        */
        int sum = sum(arr);
        double avg = (double) (sum/arr.length);
        return avg;
    }


    public void rever(int[] arr){

        /**
        * @Description: 对数组进行反转
         * @param arr
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-15 17:54
        */
        for (int i = 0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }

    public int[] copyArray(int[] arr){

        /**
        * @Description: 复制一个数组
         * @param arr
        * @return: int[]
        * @Author: MingmingCui
        * @Date: 2019-11-15 17:56
        */
        int[] copyArray = new int[arr.length];
        for (int i = 0;i<copyArray.length;i++){
            copyArray[i] = arr[i];
        }
        return copyArray;
    }

    public void sort(int[] arr){

        /**
        * @Description: 对数组进行冒泡排序
         * @param arr
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-15 17:58
        */
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length -1 - i;j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public int searchPostion(int[] arr,int value){

        /**
        * @Description: 查找数组中指定的值，并返回值所在的位置
         * @param arr
         * @param value
        * @return: int
        * @Author: MingmingCui
        * @Date: 2019-11-15 18:02
        */
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == value){
                return i;
            }
        }
        return -1;//-1表示没找到！
    }

    public void print(int[] arr){

        /**
        * @Description: 遍历数组
         * @param arr
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-15 18:08
        */
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }


}
