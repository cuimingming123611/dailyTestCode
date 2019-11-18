package encapusulation;

/**
 * @Author: MingmingCui
 * @Description:  封装性的内容
 * @Date:15:37 2019-11-18
 */
public class Animal {
    private String name;
    private int age;
    private int legs;

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
        if (age >=0 && age<130){
            this.age = age;
        }else {

            //抛出错误
            throw new RuntimeException("人的年龄不能小于0或者大于130岁");
        }
    }

    public int getLegs() {
        return legs;

    }

    public void setLegs(int legs) {
        if (legs == 0&& legs%2==0){
            this.legs = legs;
        }else {
            this.legs = 0;
        }
    }
}
