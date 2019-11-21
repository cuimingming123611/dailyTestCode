package extend_3;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:09:54 2019-11-21
 */
public class Graduate extends Student {
    public String major = "IT";

    @Override
    public String getInfo() {
        return "Name : " + name + " age :" + age + " schllo :" + school + " major :" + major;
    }
}
