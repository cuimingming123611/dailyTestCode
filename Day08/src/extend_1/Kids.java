package extend_1;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:13:52 2019-11-20
 */
public class Kids extends ManKind{
    private int yearsOld;

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        
        /** 
        * @Description: 打印yearsOld 
         * @param  
        * @return: void 
        * @Author: MingmingCui
        * @Date: 2019-11-20 13:53
        */
        System.out.println(this.getYearsOld());
    }

    @Override
    public void emplyeed() {
        super.emplyeed();
        System.out.println("学生一定是没有工资的！");
    }
}
