package excited;

/**
 * @Author: MingmingCui
 * @Description:  用于生成随机数的限制
 * @Date:14:17 2019-11-15
 */
public class MathRandom {
    //max 取值的最大值
    //min 取值的最小值  在min和max之间取值
    public static int number(int max,int min){

        /**
        * @Description:  用于生成随机数的限制
         * @param max 区间最大值
         * @param min 区间最小值
        * @return: int
        * @Author: MingmingCui
        * @Date: 2019-11-15 16:12
        */
        return (int)(Math.random() * (max - min+1)+min);
    }
}
