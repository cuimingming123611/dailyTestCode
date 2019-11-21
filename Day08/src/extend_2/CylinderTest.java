package extend_2;


/**
 * @Author: MingmingCui
 * @Description: 测试类
 * @Date:14:14 2019-11-20
 */
public class CylinderTest {

    public static void main(String args[]) {
        Cylinder cylinder = new Cylinder();
        double length = cylinder.getLength();
        System.out.println(length);
        cylinder.setLength(2);
        cylinder.setRadius(1);
        double cylinderVolume = cylinder.findVolume();
        System.out.println("体积为："+ cylinderVolume);
        double area = cylinder.findArea();
        System.out.println("底面积为:"+ area);
    }
}
