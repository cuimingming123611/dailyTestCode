package excited;

/**
 * @Author: MingmingCui
 * @Description:  面向对象的练习
 * @Date:13:39 2019-11-15
 */
public class Person {
    String name;
    int age;
    /**
     * 0代表女性
     * 1代表男性
     */
    int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println(age);
    }

    public int addAge(int i){
        age += i;
        return age;
    }
}
