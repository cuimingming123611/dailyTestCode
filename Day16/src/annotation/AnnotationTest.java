package annotation;

/**
 * @author: MingmingCui
 * @Description:
 * @date: 2019-12-04 11:47
 */
public class AnnotationTest {
    public static void main(String args[]) {
        AnnotationTest annotationTest = new AnnotationTest();
        annotationTest.test("zh");
        System.out.println(annotationTest.test(1212));
    }
    /**
     * @Description:
     * @param name 字符串name
     * @return: void
     * @author: CuiMingming
     * @date: 2019-12-04 11:50
     */
    public void test(String name){

        System.out.println(name);
    }

    /**
     * @description: 注释测试
     * @param number 学生的学号
     * @return: int 返回修改后的学生编号
     * @author: CuiMingming
     * @date: 2019-12-04 12:23
     */
    public int  test(int number){


        int number2 = number;
        return number2;

    }
    
}


