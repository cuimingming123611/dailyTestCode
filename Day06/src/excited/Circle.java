package excited;

/**
 * @Author: MingmingCui
 * @Description: 计算圆的面积
 * @Date:13:46 2019-11-15
 */
public class Circle {
    //圆的半径
     double radius ;

     //圆面积的计算方法
    public double circleSize(){
        double area = 3.14 * radius * radius;
        return area;
    }

}
