/**
 * @Author: MingmingCui
 * @Description:  数据工具测试类
 * @Date:17:41 2019-11-15
 */
public class ArrayUtilTest {
    public static void main(String args[]) {
        int[] arr = new int[]{10,38,49,30,399,302,-39,-239,239,-1,0};
         ArrayUtil arrayUtil = new ArrayUtil();
         //获取最大值
         int maxNumber = arrayUtil.getMax(arr);
         System.out.println(maxNumber);

         //获取最小值
        int minNumber = arrayUtil.getMin(arr);
        System.out.println(minNumber);

        //获取总和
        int sum = arrayUtil.sum(arr);
        System.out.println(sum);

        //获取平均值
        double avg = arrayUtil.avg(arr);
        System.out.println(avg);

        //反转数组
        arrayUtil.rever(arr);
        arrayUtil.print(arr);

        System.out.println();
        //复制数组
        int[] copyArray = arrayUtil.copyArray(arr);
        arrayUtil.print(copyArray);

        System.out.println();
        //数组排序
        arrayUtil.sort(arr);
        arrayUtil.print(arr);

        System.out.println();
        //查找数组中的值
        int value = 0;
        int temp = arrayUtil.searchPostion(arr,value);
        if (temp == -1){
            System.out.println("未找到数值！");
        }else {
            System.out.println(temp);
        }


    }
}
