package abstractpage;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:14:49 2019-11-22
 */
public class CommonEmployee extends Employee{

    @Override
    public void work() {
        System.out.println("一线员工，在一线上班！");
    }
}
