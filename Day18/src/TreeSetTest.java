import org.junit.Test;

import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author: CuiMingming
 * @Description: TreeSet 的学习
 * @date: 2019-12-06 10:56
 */
public class TreeSetTest {
    @Test
    public void test(){
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        //向TreeSet中添加数据，要求是相同类的对象

        /* 错误的例子
        treeSet.add(12);
        treeSet.add("AA");
        treeSet.add("BB");
        treeSet.add(new Date());
        */
        //添加后，自动排序了
        integerTreeSet.add(12);
        integerTreeSet.add(-30);
        integerTreeSet.add(-50);
        integerTreeSet.add(60);
        integerTreeSet.add(60);
        System.out.println(integerTreeSet);

        Iterator<Integer> iterator = integerTreeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
