package keyworldthis;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:18:48 2019-11-18
 */
public class Girl {
    private String name;
    private int age;

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

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        //只需要传入当前girl对象即可，boy中的marry（）方法的形参为girl对象类型
        boy.marry(this);
    }


    public int compare(Girl girl){

        /**
        * @Description: 对比两个对象的年龄的大小
         * @param girl
        * @return: int 正数：当前对象大  负数：当前对象小  0：一样大
        * @Author: MingmingCui
        * @Date: 2019-11-18 18:57
        */
        return this.getAge() - girl.getAge();
    }

}
