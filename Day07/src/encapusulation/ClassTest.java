package encapusulation;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:16:28 2019-11-18
 */
public class ClassTest {
    public static void main(String args[]) {
        Animal animal = new Animal();
        animal.setAge(120);
        System.out.println(animal.getAge());
    }

}
