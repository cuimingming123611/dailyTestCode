package abstractpage;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:14:48 2019-11-22
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    //重写父类的抽象方法
    @Override
    public void work() {
        System.out.println("管理员工，提高公司的运行效率");

    }
}
