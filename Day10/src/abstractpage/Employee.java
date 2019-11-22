package abstractpage;

/**
 * @Author: MingmingCui
 * @Description: 抽象类的学习
 * @Date:14:15 2019-11-22
 */
public abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public abstract void work();
}
