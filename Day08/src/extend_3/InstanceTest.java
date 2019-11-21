package extend_3;

import java.awt.*;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:09:56 2019-11-21
 */
public class InstanceTest {
    public static void main(String args[]) {
        InstanceTest instanceTest = new InstanceTest();
        instanceTest.method(new Student());
    }
   public void method(Person person){
       String info = person.getInfo();
       System.out.println(info);
       if (person instanceof Graduate){
           System.out.println("a Graduate student");
           System.out.println("a student");
           System.out.println("a person");
       }else if (person instanceof Student){
           System.out.println("a student");
           System.out.println("a person");
       }else {
           System.out.println("a person");
       }
   }
}
