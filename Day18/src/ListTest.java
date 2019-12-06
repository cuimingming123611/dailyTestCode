import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author: CuiMingming
 * @Description:  "动态"数组 list接口中常用的方法
 * @date: 2019-12-05 17:01
 */
public class ListTest {
    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add(12);
        list.add(45);
        list.add("AA");
        list.add("BB");
        list.add("BB");
        list.add(new Date());
        System.out.println(list);

        //void add(int index,Object obj)
        list.add(1,"DD");
        System.out.println(list);

        //boolean addAll(int index,Collection eles) 把collection中所有的元素添加到当前ArraysList中
        List<Integer> list1 = Arrays.asList(66, 77, 88);
        boolean b = list.addAll(list1);
        if (b){
            System.out.println(list);
        }

        //Object get(int index) 获取索引位置上的元素
        System.out.println(list.get(1));


        //int indexOf(Object obj ) 索引对象首次出现的位置,如果不存在，返回-1
        System.out.println(list.indexOf(45));


        //int lastIndexOf(Object obj) 最后一次出现的位置，如果不存在，返回-1
        System.out.println(list.lastIndexOf(45));


        //Object remove(int index)  移除指定索引位置上的元素，并返回此元素
        System.out.println(list.remove(1));

        //Object set(int index,Object ele)  修改索引位置上的元素，并返回修改钱的元素
        System.out.println(list.set(1, "55"));
        System.out.println(list);


        //List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置左闭右开的子集
        System.out.println(list.subList(1, 5));


    }
    
}
