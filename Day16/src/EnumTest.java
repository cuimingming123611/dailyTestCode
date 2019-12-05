/**
 * @Author: MingmingCui
 * @Description: 枚举类的使用
 * @Date:10:40 2019-12-04
 */
public class EnumTest {

    public static final EnumTest ENUM_TEST = new EnumTest();

    public static void main(String args[]) {

        Season summer = Season.SUMMER;

        System.out.println(summer.getClass().getSuperclass());//获取父类
        System.out.println(summer);//toString()
        System.out.println(summer.getSeasonName());//获得值
        //values()
        Season[] values = Season.values();
        for (int i = 0; i <values.length ; i++) {
            System.out.println(values[i]);
        }
        //valueOf()
        Season season = Season.valueOf("SUMMER");
        System.out.println(season);

        //调用重写方法
        Season.WINTER.show();



    }

}
interface Info{
    void show();
}
enum Season implements Info{

    SPRING("春天"){
        @Override
        public void show() {
            System.out.print("春天在哪里");
        }
    },
    SUMMER("夏天"){
        @Override
        public void show() {
            System.out.print("宁夏");
        }
    },
    AUTUMN("秋天"){
        @Override
        public void show() {
            System.out.print("秋天不回来");
        }
    },
    WINTER("冬天"){
        @Override
        public void show() {
            System.out.print("大约在冬季");
        }
    };
    private final String seasonName;


    Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonName() {
        return seasonName;
    }
}
