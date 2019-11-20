package extend_2;

/**
 * @Author: MingmingCui
 * @Description: 圆柱类
 * @Date:14:10 2019-11-20
 */
public class Cylinder extends Circle{
    private double length;//高度

    public Cylinder() {
        this.length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){

        /**
        * @Description: 计算圆柱体的体积
         * @param
        * @return: double
        * @Author: MingmingCui
        * @Date: 2019-11-20 14:13
        */
        //使用super指向父类被重写的方法
        return super.findArea() * getLength();
    }

    @Override
    public double findArea() {
        
        /** 
        * @Description: 求圆柱体的表面积 
         * @param  
        * @return: double 
        * @Author: MingmingCui
        * @Date: 2019-11-20 15:46
        */
        return Math.PI*getRadius()*getRadius()*2 + 2*Math.PI*getRadius()*getLength();
    }
}


