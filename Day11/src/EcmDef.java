/**
 * @Author: MingmingCui
 * @Description: 异常处理
 * @Date:09:23 2019-11-26
 */
public class EcmDef {
    public static void main(String args[]) throws EcDef {

        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            int result = ecm(i, j);
            //常见异常类
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("缺少命令行");
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("除0");
            //抓取手动抛出的异常
        }catch (EcDef ecDef){
            ecDef.getMessage();
        }
    }

    public static int ecm(int i, int j) throws EcDef {
        if (i < 0 || j < 0) {
            //手动抛出异常
            throw new EcDef("分子或者分母为负数了！");
        }
        return i / j;
    }

}
