import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author: CuiMingming
 * @Description: iterator(）接口测试
 * @date: 2019-12-05 16:09
 */
public class IteratorTest {
    //集合元素的遍历操作，使用迭代器Iterator接口
    @Test
    public void test(){
        Collection collection1 = new ArrayList();
        collection1.add("CC");
        collection1.add(4567);
        collection1.add(new String("Tom"));
        collection1.add(new Person("Jerry",20));


        //遍历collection
        Iterator iterator = collection1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
    @Test
    public void IteratorRemoveTest(){
        /** 
         * @description: 测试iterator接口中remove（）的方法
          * @param  
         * @return: void 
         * @author: CuiMingming
         * @date: 2019-12-05 16:34
         */
        Collection collection1 = new ArrayList();
        collection1.add("CCB");
        collection1.add(4567);
        collection1.add(new String("Tom"));
        collection1.add(new Person("Jerry",20));

        Iterator iterator = collection1.iterator();
        //删除集合中Tom的数据
        while (iterator.hasNext()){
            Object o = iterator.next();
            if ("Tom".equals(o)){
                //在iterator内部调用
                iterator.remove();
            }
        }
        //重新遍历
        Iterator iterator1 = collection1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("**********************");
        System.out.println(collection1);
    }
}
