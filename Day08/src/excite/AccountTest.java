package excite;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:17:25 2019-11-20
 */
public class AccountTest {
    public static void main(String args[]) {
        Account account = new Account(1122,20000,0.045);
        account.withdraw(30000);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("余额为："+account.getBalance());
        System.out.println("月利率为："+account.getMothlyInteresRate());
    }
}
