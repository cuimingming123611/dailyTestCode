/**
 * @Author: MingmingCui
 * @Description:  类中方法的使用
 * @Date:11:43 2019-11-15
 */


/*
* 方法：描述类应该具有的功能
* 1、方法的声明
*   权限修饰符 返回值类型 方法名（形参列表）{
*       方法体
*   }
*
* 2、说明：
*   2.1 关于权限修饰符：public、private、缺省、protect
*   2.2 返回值类型： 有返回值 VS 无返回值
*       2.2.1 如果方法有返回值，则必须在方法声明时，指定返回值的类型，同时方法中，
*             需要使用return关键字来返回指定类型的变量或者常量
*
*             如果方法没有返回值，则方法声明时，使用void来表示，通常，没有返回值的方法中，
*             就不使用return，但是，如果使用，直接"return;"，表示直接结束该方法
*
*   2.3 方法名：属于标识符，遵循标识符的规范
*
*   2.4 形参列表： 数据类型1 形参1，数据类型2 形参2，···
*
*
*   return关键字的使用：
*   1、使用范围：方法体内
*   2、作用：
*       （1）结束方法
*       （2）针对有返回值类型的方法，使用"return 数据;"方法返回所要的数据
*       （3）注意：return关键字后面不可以声明执行语句
*
*
*   方法的使用：
*   1、可以调用当前类的属性和方法；
*   2、方法中不可以定义方法
*
*
*
*
* */
public class Customer {
    public static void main(String args[]) {

    }

    String name;


    public void eat(){
        System.out.println("吃东西");
    }

    public void sleep(int hour){
        System.out.println("休息了"+hour+"小时");
    }

    public String getname(){
        return name;
    }

    public String getNation(String nation){
        String info = "我的国籍是"+ nation;
        return info;
    }

}
