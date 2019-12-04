import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: MingmingCui
 * @Description: java比较器
 * @Date:09:20 2019-12-04
 */

/*
* 1、java中对象，正常情况下，只能使用 == 或者 != 进行比较
* 2、对多个对象进行排序，则可以使用两个接口：comparable 或者 comparator
*
* 3、comparable自然排序：
*
* 4、（自然排序）对于自定义类来说，如果需要排序，可以自定义类实现comparable接口，重写compareTo（）方法，在方法中指明如何排序
*
* 5、comparator定制排序：
*
*
* */
public class ComparableTest {
    public static void main(String args[]) {
        ComparableTest comparableTest = new ComparableTest();
        comparableTest.test();
        System.out.println("**************************");
        comparableTest.test2();
    }



    public void test(){
        Goods[] goods = new Goods[4];
        goods[0] = new Goods("联想鼠标",23);
        goods[1] = new Goods("戴尔鼠标",43);
        goods[2] = new Goods("小米鼠标",12);
        goods[3] = new Goods("华为鼠标",65);
        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));

    }
    public void test2(){
        Goods[] goods = new Goods[5];
        goods[0] = new Goods("联想鼠标",23);
        goods[1] = new Goods("戴尔鼠标",43);
        goods[2] = new Goods("小米鼠标",12);
        goods[3] = new Goods("华为鼠标",55);
        goods[4] = new Goods("华为鼠标",100);
        Arrays.sort(goods, new Comparator<Goods>() {
            //comparator的使用 <泛型>
            @Override
            public int compare(Goods o1, Goods o2) {
                if (o1.getName().equals(o2.getName())){
                    return Double.compare(o1.getPrice(),o2.getPrice());
                }else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        System.out.println(Arrays.toString(goods));

    }

}
