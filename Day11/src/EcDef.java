/**
 * @Author: MingmingCui
 * @Description: 自定义异常类
 * @Date:09:34 2019-11-26
 */
//自定义异常类，需要继承Exception
public class EcDef extends Exception{
    //定义异常类的UID
    static final long serialVersinUID = -33875164229948L;
    //定义异常类的构造器
    public EcDef() {
    }
    //定义异常类带参数的构造器
    public EcDef(String msg){
        super(msg);
    }
}
