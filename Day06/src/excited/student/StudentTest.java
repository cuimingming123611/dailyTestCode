package excited.student;

import excited.MathRandom;

/**
 * @Author: MingmingCui
 * @Description: 使用数组，创建多个学生对象
 * @Date:14:05 2019-11-15
 */
public class StudentTest {
    public static void main(String args[]) {

      //声明学生类数组（对象数组）
        Student[] students = new Student[20];
        for (int i =0;i<students.length;i++){
            students[i] = new Student();
            students[i].number = MathRandom.number(999,100);
            students[i].state = MathRandom.number(9,1);
            students[i].score = MathRandom.number(100,0);
        }

        StudentTest studentTest = new StudentTest();
        System.out.println("成绩排序前的结果：");
        studentTest.print(students);

        //进行排序
        studentTest.sort(students);

        System.out.println("成绩排序后的结果：");
        studentTest.print(students);

        System.out.println("查看3年级的学生成绩：");
        studentTest.searchState(students,3);

    }

    public void sort(Student[] students){

        /**
        * @Description: 按照学生的成绩冒泡排序
        * @Param:   [students]
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-15 15:56
        */
        for (int i = 0;i<students.length;i++){
            for (int j = 0;j<students.length -1 - i;j++){
                if (students[j].score < students[j+1].score){
                    //注意：交换的不是学生的成绩，而是学生整个信息，成绩只是排序的条件
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }


    public void print(Student[] students){

        /**
        * @Description:  遍历学生的基本信息
        * @Param: [students]
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-15 15:47
        */
        for(int i = 0;i<students.length;i++){
            System.out.println(students[i].getStudentInfo());
        }
    }

    public void searchState(Student[] students,int state){

        /**
        * @Description:  查询指定班级学生的学生信息
        * @Param: [students, state]
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-15 15:47
        */

        for (int i = 0;i<students.length;i++){
            if (students[i].state == state){
                System.out.println("学号："+students[i].number+" 年级："+students[i].state+" 成绩："+students[i].score);
            }
        }
    }

}
