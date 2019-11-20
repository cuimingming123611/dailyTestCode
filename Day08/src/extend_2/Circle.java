package extend_2;

/**
 * @Author: MingmingCui
 * @Description: 圆的类
 * @Date:14:06 2019-11-20
 */
public class Circle {
    private double radius;//半径

    public Circle() {
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){

        /**
        * @Description: 计算圆的面积
         * @param
        * @return: double
        * @Author: MingmingCui
        * @Date: 2019-11-20 14:09
        */
        return Math.PI * radius * radius;
    }
}
