package extend_1;

/**
 * @Author: MingmingCui
 * @Description:  继承性
 * @Date:13:46 2019-11-20
 */
public class ManKind {
    private int sex;
    private int salary;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman(){

        /**
        * @Description: 显示是男生还是女生
         * @param
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-20 13:48
        */
        if (this.sex == 1){
            System.out.println("man");
        }else if (this.sex == 0){
            System.out.println("woman");
        }else {
            System.out.println("do not know");
        }
    }


    public void emplyeed(){

        /**
        * @Description: 根据salary判断是否上班
         * @param
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-20 13:50
        */
        if (this.salary == 0){
            System.out.println("no job");
        }else{
            System.out.println("job");
        }
    }
}
