/**
 * @description: 数组的复制、反转、
 * @version:
 * @author: cuimingming
 * @data 2019/11/14 0014 下午 10:59
 */
public class ArrayTest03 {
    public static void main(String[] args){
        String[] arr = new String[]{"AA","BB","CC","DD"};
        //数组的复制
            String[] arr2 = new String[arr.length];
            for (int i = 0;i<arr2.length;i++){
                arr2[i] = arr[i];
            }
            //改变arr2的内容
            for (int i = 0;i<arr2.length;i++){
                if (i%2 == 0){
                    arr2[i] = "改变";
                }
            }
            //打印arr
            for (int i = 0;i<arr.length;i++){
                System.out.print(arr[i] +" ");
            }
            System.out.println();
            for (int i = 0;i<arr2.length;i++){
                System.out.print(arr2[i] +" ");
            }
        System.out.println();
        //数组的反转
        for (int i = 0;i<arr.length/2;i++){
            String temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;

        }
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println();
        //查找
        //1、线性查找
        String dest = "AA";
        boolean isFlag = true;
        for (int i = 0;i<arr.length;i++){
            if (arr[i].equals(dest)){
                System.out.println("找到了，位置为"+i);
                isFlag = false;
            }
        }
        if (isFlag){
            System.out.println("很遗憾，没有找到！");
        }

        String dest2 = "BB";
        boolean isFlag2 = true;
        for (int i = 0,j = arr.length -1;i<j;i++,j--){
            if (arr[i].equals(dest2)){
                System.out.println("找到了，位置为"+i);
                isFlag2 = false;
            }
            if (arr[j].equals(dest2)){
                System.out.println("找到了，位置为"+j);
                isFlag2 = false;
            }
        }
        if (isFlag2){
            System.out.println("很遗憾，没有找到！！！！");
        }
    }
}
