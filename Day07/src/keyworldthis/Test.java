package keyworldthis;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:18:58 2019-11-18
 */
public class Test {
    public static void main(String args[]) {
        Boy boy = new Boy("罗密欧",21);
        boy.shout();

        Girl girl = new Girl("朱丽叶",18);
        boy.marry(girl);

        Girl girl1 = new Girl("祝英台",19);

        int compare = girl.compare(girl1);
        if (compare > 0){
            System.out.println(girl.getName()+"年龄大");
        }else if (compare < 0){
            System.out.println(girl1.getName()+"年龄大");
        }else {
            System.out.println("一样大！");
        }
    }
}
