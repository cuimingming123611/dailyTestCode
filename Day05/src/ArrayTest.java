/**
 * @Author: MingmingCui
 * @Description: 关于数组的概述
 * @Date:09:35 2019-11-14
 */

/*
 * 数组的相关概念：
 * 1、数组名
 * 2、元素
 * 3、下标/角标/索引
 * 4、数组的长度
 * */


/*
* 数组内容的重点：
* 1、一维数组的声明和初始化
* 2、如何调用数组指定位置的元素
* 3、如何获取数组的长度
* 4、如何遍历数组
* 5、数组元素的默认初始化值
* 6、数组的内存解析
* */
public class ArrayTest {
    public static void main(String args[]) {
        //1、数组的声明和初始化，一旦初始化后，数组的长度就确定，后续不可修改
        //静态初始化
        int[] numbers;
        numbers = new int[]{1,2,3,4,5};//直接赋值

        //动态初始化
        int[] numbers2 = new int[5];//先创建空间，使用时在赋值

        //2、如何调用数组指定位置的元素
        numbers2[0] = 100012;
        numbers2[1] = 100013;
        numbers2[2] = 100014;
        numbers2[3] = 100015;
        numbers2[4] = 100016;

        //3、获取数组的长度；
        int arrayLength =   numbers2.length;
        System.out.println("数组长度为："+arrayLength);

        //4、遍历数组元素
        for (int i = 0;i<arrayLength;i++){
            System.out.println(numbers2[i]);
        }

        //
    }
}
