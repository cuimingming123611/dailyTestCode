import org.junit.Test;

import java.util.*;

/**
 * @author: CuiMingming
 * @Description: set接口的测试
 * @date: 2019-12-06 09:54
 */
public class SetTest {
    @Test
    public void test(){
        HashSet<Integer> integers = new HashSet<>();
        integers.add(22);
        integers.add(80);
        integers.add(90);
        integers.add(100);
        System.out.println(integers);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test1(){
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(23);
        linkedHashSet.add(34);
        linkedHashSet.add(56);
        linkedHashSet.add(78);
        linkedHashSet.add(66);
        linkedHashSet.add(66);
        System.out.println(linkedHashSet);
        Iterator<Object> objectIterator = linkedHashSet.iterator();
        while (objectIterator.hasNext()){
            System.out.println(objectIterator.next());
        }
    }

    @Test
    public void test2(){
        TreeSet<User> userTreeSet = new TreeSet<>();
        userTreeSet.add(new User("Tom",25));
        userTreeSet.add(new User("Jem",30));
        userTreeSet.add(new User("Jack",50));
        userTreeSet.add(new User("Lin",25));
        userTreeSet.add(new User("Lin",55));
        //重写compareTo（）方法，完成自然排序
        Iterator<User> iterator = userTreeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test3(){
        //自定义排序
        Comparator userComparator = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User){
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                }else {
                    throw new RuntimeException("类型不匹配");
                }
            }
        };
        //传入userComparator，为定制排序
        TreeSet users = new TreeSet(userComparator);
        users.add(new User("Tome",25));
        users.add(new User("Jem",30));
        users.add(new User("Jacki",50));
        users.add(new User("LinW",25));
        users.add(new User("LinW",55));

        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
