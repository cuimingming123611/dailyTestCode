package extend_4;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:10:17 2019-11-21
 */
public class GeometricTest {
    public static void main(String args[]) {
        GeometricTest geometricTest = new GeometricTest();
        Circle circle = new Circle("width",2.0,3.14);
        geometricTest.dispalyGeometricObject(circle);

        Circle circle2 = new Circle("width",2.0,5.12);
        geometricTest.dispalyGeometricObject(circle2);

        boolean isEqual = geometricTest.equalsArea(circle,circle2);
        System.out.println(isEqual);
    }

    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }

    public void dispalyGeometricObject(GeometricObject object){
        System.out.println("面积为：" + object.findArea());
    }
}
