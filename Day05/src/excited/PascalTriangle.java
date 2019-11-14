package excited;

/**
 * @Author: MingmingCui
 * @Description: 杨辉三角的打印
 * @Date:12:53 2019-11-14
 */
public class PascalTriangle {
    public static void main(String args[]) {
        //1、初始化数组
        int[][] yanghui = new int[10][];

        //2、给数组元素赋值
        for (int i = 0;i<yanghui.length;i++){
            yanghui[i] = new int[i+1];//初始化内层数组

            //给每行的首尾元素赋值
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;

            //给剩余位置赋值
            for (int j = 1;j<yanghui[i].length-1;j++){
                yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
            }
        }

        //3、遍历数组
        for (int i = 0;i<yanghui.length;i++){
            for (int j = 0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
