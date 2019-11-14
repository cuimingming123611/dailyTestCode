package excited;

import java.util.Scanner;

/**
 * @Author: MingmingCui
 * @Description: 数组的测试题目
 * @Date:11:05 2019-11-14
 */
public class ArrayDemo1 {
    public static void main(String args[]) {
        Scanner scannr = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int number = scannr.nextInt();
        //动态初始化数组
        int[] scores = new int[number];

        System.out.println("请输入"+number+"个学生成绩：");

        //给数组元素进行赋值
        int maxScore = scores[0];
        for (int i = 0;i<scores.length;i++){
            scores[i] = scannr.nextInt();
            //找出数组中的最大值
            if (scores[i]>maxScore){
                maxScore = scores[i];
            }
        }

        //得出学生成绩的等级
        char level;
        for (int i = 0;i<scores.length;i++){
            int scoreGap = maxScore - scores[i];
            if (scoreGap <= 10 ){
                level = 'A';
            }else if (scoreGap <= 20){
                level = 'B';
            }else if (scoreGap <= 30){
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("student "+ (i+1) +" score is "+ scores[i]+" ,grade is " + level);
        }
    }
}
