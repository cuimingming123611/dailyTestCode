package extend_1;

/**
 * @Author: MingmingCui
 * @Description: 测试类
 * @Date:13:53 2019-11-20
 */
public class KidTest {
    public static void main(String args[]) {
          Kids someKid = new Kids();
            someKid.setSex(1);
            someKid.manOrWoman();
            System.out.println();
            someKid.setSalary(0);
            someKid.emplyeed();
            System.out.println();
            someKid.setYearsOld(2000);
            someKid.printAge();
    }
}
