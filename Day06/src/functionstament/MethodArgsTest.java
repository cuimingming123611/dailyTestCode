package functionstament;

/**
 * @Author: MingmingCui
 * @Description: 可变个数行参的方法
 * @Date:14:53 2019-11-17
 */
public class MethodArgsTest {
    /*
    * 1、可变个数形参：方法名（参数类型 ··· 参数名）
    * 2、当调用可变个数形参的方法时，传入的参数个数可以是：0个或者0个以上
    * 3、可变个数形参的方法与本类中方法名相同、形参不同的方法之间构成重载
    * 4、可变个数形参，在方法的形参中必须声明在末尾，
    *   public void show(int i ,String ... strs)  正确
    *   public void show(String ... strs ,int i )  错误
    * 5、可变个数形参的方法中，只能声明一个可变形参
    *
    * */

    public void show(int i){

    }

    public void show(String i){

    }

    public void show(String ... strs){
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

    }
    //数组的方式与上面方法相同，不能同时存在
    /* public void show(String[] strs){

     }*/
}
