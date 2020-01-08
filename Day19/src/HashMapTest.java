import org.junit.Test;

import java.util.*;

/**
 * @author: CuiMingming
 * @Description: HashMap的用法测试
 * @date: 2019-12-13 16:29
 */
public class HashMapTest {
    @Test
    public void test2(){
        HashMap hashMap = new HashMap();
        hashMap.put("name", "张三");
        hashMap.put("age", 25);
        hashMap.put("sex", 0);

        //修改
        hashMap.put("name", "张五");

        HashMap hashMap1 = new HashMap();
        hashMap1.put("name2", "张五");
        hashMap1.put("status", "离婚");

        //putAll()
        hashMap.putAll(hashMap1);
        System.out.println(hashMap);

        //remove(Object key)
        Object value = hashMap.remove("name2");
        System.out.println(value);

        //clear()
        hashMap1.clear();
        System.out.println(hashMap1.size());

        //元素查询 get(Object key)
        System.out.println(hashMap.get("name"));

        //判断是否包含指定Key
        boolean containsKey = hashMap.containsKey("name");
        System.out.println(containsKey);

        //判断是否包含指定Value
        boolean containsValue = hashMap.containsValue("张五");
        System.out.println(containsValue);


        //是否为空isEmpty();
        boolean empty = hashMap.isEmpty();
        System.out.println(empty);

        //equals()
        boolean equals = hashMap.equals(hashMap1);
        System.out.println(equals);

        //遍历所有key的值
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //遍历所有value的值
        Collection values = hashMap.values();
        for (Object obj : values
                ) {
            System.out.println(obj);
        }


        //遍历所有的key和value  entrySet()方法
        Set set1 = hashMap.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }




    @Test
    public void  Test(){
        HashMap hashMap = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("name", "张三");
        linkedHashMap.put("age", 25);
        linkedHashMap.put("sex", 0);

        System.out.println(linkedHashMap);

    }


}
