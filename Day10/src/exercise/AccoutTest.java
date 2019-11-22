package exercise;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:10:59 2019-11-22
 */
public class AccoutTest {
    public static void main(String args[]) {
        Account.setInterestRate(0.045);
        Account.setMinMoney(0.01);

        Account account = new Account("张三", "320721198711203546", "123456");
        System.out.println("银行卡号："+account.getId());
        System.out.println("姓名："+account.getName());
        System.out.println("身份证号："+account.getIdentityCard());
        System.out.println("余额："+account.getBalance());
        System.out.println("利率："+account.getInterestRate());
        System.out.println("最小金额："+account.getMinMoney());

        Account account1 = new Account("李四", "320721198712074563", "123456");
        System.out.println("银行卡号："+account1.getId());
        System.out.println("姓名："+account1.getName());
        System.out.println("身份证号："+account1.getIdentityCard());
        System.out.println("余额："+account1.getBalance());



    }
}
