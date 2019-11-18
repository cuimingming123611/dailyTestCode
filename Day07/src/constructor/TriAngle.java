package constructor;

import java.util.Timer;

/**
 * @Author: MingmingCui
 * @Description: 三角形的类
 * @Date:17:09 2019-11-18
 */
public class TriAngle {
    
    private double base;
    private double height;
    //构造器 空参
    public TriAngle(){

    }
    //带形参列表的构造器
    public TriAngle(double base,double height){
        this.base = base;
        this.height = height;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
