package excited;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:13:11 2019-11-14
 */
public class ArrayDemo2 {
    public static void main(String args[]) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*30+1);
            boolean isFlag = false;
            while (true){
                for (int j=0;j<=i;j++){
                    if (arr[i] == arr[j]){
                        isFlag = true;
                        break;
                    }
                }
                if (isFlag){
                    arr[i] = (int)(Math.random()*30+1);
                    isFlag = false;
                    continue;
                }
                break;
            }
        }
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
