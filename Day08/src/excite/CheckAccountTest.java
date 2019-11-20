package excite;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:17:57 2019-11-20
 */
public class CheckAccountTest {
    public static void main(String args[]) {
        CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 5000);
        checkAccount.withdraw(5000);
        System.out.println("账户余额：" + checkAccount.getBalance());
        System.out.println("透支余额：" + checkAccount.getOverDraft());
        System.out.println("取款18000后：");
        checkAccount.withdraw(18000);
        System.out.println("账户余额：" + checkAccount.getBalance());
        System.out.println("透支余额：" + checkAccount.getOverDraft());
        System.out.println("取款3000后：");
        checkAccount.withdraw(3000);
        System.out.println("账户余额：" + checkAccount.getBalance());
        System.out.println("透支余额：" + checkAccount.getOverDraft());

    }
}
