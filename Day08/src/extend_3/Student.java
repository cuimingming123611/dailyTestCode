package extend_3;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:09:53 2019-11-21
 */
public class Student extends Person{
    protected String school = "pku";

    @Override
    public String getInfo() {
        return "Name : " + name + " age :" + age + " school :" + school;
    }
}
