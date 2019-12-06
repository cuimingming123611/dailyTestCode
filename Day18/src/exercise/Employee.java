package exercise;

/**
 * @author: CuiMingming
 * @Description:
 * @date: 2019-12-06 14:21
 */
public class Employee implements  Comparable{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        /**
         * @description: 按姓名进行排序
          * @param o 要排序的对象
         * @return: int -1小 0相等 1大于
         * @author: CuiMingming
         * @date: 2019-12-06 16:28
         */
        if (o instanceof Employee){
            Employee employee = (Employee) o;
            return this.name.compareTo(employee.getName());
        }else {
            throw new RuntimeException("类型不正确");
        }

    }
}
