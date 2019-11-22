package template;

/**
 * @Author: MingmingCui
 * @Description: 模板方法的的设计模式
 * @Date:15:08 2019-11-22
 */
public class TemplateTest {
    public static void main(String args[]) {
        SumTemplate sumTemplate = new SumTemplate();
        sumTemplate.spendTime();
    }


}

abstract class Template {
    public void spendTime() {

        /**
         * @Description: 计算某段代码运行所花费的时间
         * @param
         * @return: void
         * @Author: MingmingCui
         * @Date: 2019-11-22 15:13
         */
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));
    }

    //容易改变的部分
    public abstract void code();
}

class SumTemplate extends Template {
    @Override
    public void code() {
        for (int i = 2; i <= 1000; i++) {
            boolean isFlag = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 2) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
        }
    }
}