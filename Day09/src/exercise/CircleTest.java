package exercise;


/**
 * @Author: MingmingCui
 * @Description:
 * @Date:14:26 2019-11-21
 */
public class CircleTest {
    public static void main(String args[]) {
        Circle circle = new Circle(2.3);
        Circle circle2 = new Circle("white",2.0,3.65);
        System.out.println("颜色是否相等:" + circle.getColor().equals(circle2.getColor()));
        System.out.println("半径是否相等：" + circle.equals(circle2));
        System.out.println(circle.toString());

    }
}
