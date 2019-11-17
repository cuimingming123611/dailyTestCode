package functionstament;

/**
 * @Author: MingmingCui
 * @Description: 方法的重载
 * @Date:12:09 2019-11-17
 */
public class OverLoad {
    /*
    * 1、在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可
    *   "两同以不同"：
    *   同一个类，同一个方法名；
    *   参数列表不同，参数个数不同，参数类型不同
    *
    *  2、判断是否是重载：
    *   跟方法的修饰符，返回值类型，形参变量名、方法体都没有关系
    * */
    public void getSum(int i,int j){
        System.out.println(i+j);
    }
    public void getSum(String i, String m){
        System.out.println(i+m);
    }
    public void getSum(double i,double j){
        System.out.println(i+j);
    }


}
