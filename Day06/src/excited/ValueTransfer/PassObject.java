package excited.ValueTransfer;

import java.util.regex.PatternSyntaxException;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:11:23 2019-11-18
 */
public class PassObject {
    public static void main(String args[]) {
        PassObject passObject = new PassObject();
        Circle c = new Circle();
        passObject.printAreas(c,5);
        System.out.println("now radius is" + c.radius);
    }
    public void printAreas(Circle c,int time){

        /**
        * @Description:  打印0-time之间所有整数的半径的圆的面积
         * @param c
         * @param time
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-18 11:25
        */

        System.out.println("radius\t\tAreas");

        //设置圆的半径
        for (int i = 1; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius+"\t\t" + c.findArea());
        }
        c.radius = time+1;
    }
}
