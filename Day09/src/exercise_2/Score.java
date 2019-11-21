package exercise_2;

import java.util.Scanner;
import java.util.Vector;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:17:33 2019-11-21
 */
public class Score {
    public static void main(String args[]) {
        //1、实例化scanner
        Scanner scanner = new Scanner(System.in);

        //2、创建集合，存储分数
        Vector vector = new Vector();
        //3、通过循环，添加对象至vector,  并获得最大值
        int maxScore = 0;
        for (;;){
            System.out.println("请输入学生成绩（输入-1表示退出）：");
            int score = scanner.nextInt();
            if (score == -1){
                return;
            }else if (score<0 && score>100){
                System.out.println("请输入正确的分数：");
                continue;
            }
            vector.addElement(score);
            if (maxScore < score){
                maxScore = score;
            }
        }
        //遍历数组
       /*String level;
        for (int i = 0; i <vector.size() ; i++) {
            Object object = vector.elementAt(i);
            int score = (int)object;
            if (maxScore - score <=10){
                level = "A";
            }else if (maxScore - score <=20){
                level = "B";
            }else if (maxScore - score <=30){
                level = "C";
            }else {
                level = "D";
            }
            System.out.println("student-"+i+" score is " + score + ",level is " + level);
        }*/

    }
}
