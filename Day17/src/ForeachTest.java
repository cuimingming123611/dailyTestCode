import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: CuiMingming
 * @Description: 5.0新增foreach，用于遍历数组和集合
 * @date: 2019-12-05 16:45
 */
public class ForeachTest {
    @Test
    public void test(){
        Collection collection = new ArrayList();
        collection.add("CCBD");
        collection.add(45678);
        collection.add(new String("Tome"));
        collection.add(new Person("Jerry",20));

        //for(集合元素的类型 局部变量 ： 需要遍历的集合对象)
        //增强for循环
        for (Object obj : collection
                ) {
            System.out.println(obj);
        }
    }

}
