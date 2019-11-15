package excited.student;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:14:03 2019-11-15
 */
public class Student {
    int number;  //学号
    int state;  //年纪
    int score;  //成绩



    public String getStudentInfo(){

        /**
        * @Description: 整合用户的所有信息
         * @param
        * @return: java.lang.String
        * @Author: MingmingCui
        * @Date: 2019-11-15 16:11
        */
        return "学号："+number+" 年级："+state+" 成绩："+score;
    }




}
