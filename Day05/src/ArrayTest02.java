/**
 * @Author: MingmingCui
 * @Description: 多维数组的概述
 * @Date:11:42 2019-11-14
 */
public class ArrayTest02 {
    public static void main(String args[]) {
        //初始化二维数组
        //1、静态初始化
         int[][] arr = new int[][]{{1,3},{2,3}};
         int[][] arr3 = {{1,2},{3,4}};
        //2、动态初始化
         int[][] arr2 = new int[2][2];

         //调用数组的指定位置：
        System.out.println(arr[0][1]);

        //获取数组长度
        System.out.println(arr.length);
        System.out.println(arr[0].length);


        System.out.println("遍历二维数组");
        //遍历二维数组
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
