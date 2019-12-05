import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author: CuiMingming
 * @Description:  clooection集合的测试
 * @date: 2019-12-05 15:03
 */
public class CollectionTest {
    //向collection接口的实现类对象中添加obj，要求obj所在类要重写equal（）方法
    @Test
    public void test(){
        Collection collection = new ArrayList();
        //add()
        collection.add("AA");
        collection.add("BB");
        collection.add(123);//自动装箱
        collection.add(456);//自动装箱
        collection.add(new Date());

        //size()
        System.out.println(collection.size());

        //addAll（）
        Collection collection1 = new ArrayList();
        collection1.add("CC");
        collection1.add(456);
        collection1.addAll(collection);
        collection1.add(new String("Tom"));
        collection1.add(new Person("Jerry",20));
        System.out.println(collection1.size());
        System.out.println(collection1.toString());

        //clear():清空数据对象
        //collection.clear();

        //isEmpty():判断当前集合是否为空,size是否为0
        System.out.println(collection.isEmpty());

        //contains(Object obj):判断当前集合中是否包含obj
        //比较时，会调用obj当前类的equal（）方法
        System.out.println(collection1.contains(456));
        System.out.println(collection1.contains(new String("Tom")));
        //比较的是equal（）方法
        System.out.println(collection1.contains(new Person("Jerry", 20)));

        //containsAll（）:判断形参中的所有元素都在当前集合中
        System.out.println(collection1.contains(collection));

        //remove()：从当前集合中移除某个对象
        System.out.println(collection1.remove(123));
        System.out.println(collection1.remove(new Person("Jerry",20)));
        System.out.println(collection1);

        //removeAll(Collection collection):从当前集合中移除collection中所有的元素
        //System.out.println(collection1.removeAll(collection));
        System.out.println(collection1);


        //retainAll(Collection collection)：修改当前集合，只保留与collection中相同的对象
        System.out.println(collection1.retainAll(collection));
        System.out.println(collection1);

        //equal（Object object）//元素顺序也必须相同
        System.out.println(collection1.equals(collection));

        //hashCode():返回当前对象的hash值
        System.out.println(collection1.hashCode());


        //集合--》数组
        //toArray()
        Object[] objects = collection.toArray();
        for (int i = 0; i <objects.length ; i++) {
            System.out.println(objects[i]);
        }
        //数组转为集合
        List<Object> list = Arrays.asList(objects);
        System.out.println(list);
        //基本类型时，需要使用包装类
        List<Integer> list1 = Arrays.asList(new Integer[]{12, 15, 60});
        System.out.println(list1);

        //iterator（）：返回iterator接口的实例，用于遍历元素
        //见iteratorTest.class

    }

}
