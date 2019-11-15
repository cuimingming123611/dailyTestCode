package excited;

/**
 * @Author: MingmingCui
 * @Description: Person类的使用
 * @Date:13:43 2019-11-15
 */
public class PersonTest {
    public static void main(String args[]) {
           Person person = new Person();
           person.name = "Tom";
           person.age = 18;
           person.sex = 1;
           person.showAge();
           person.addAge(2);
           person.showAge();
           person.study();

    }
}
