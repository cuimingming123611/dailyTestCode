package super_use;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:15:55 2019-11-20
 */
public class SuperTest {
    public static void main(String args[]) {
        Student student = new Student("张三",26,"计算机专业",320721199);
        student.id = 10002;
        student.show();
    }
}
