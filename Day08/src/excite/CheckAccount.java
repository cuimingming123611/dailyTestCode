package excite;

/**
 * @Author: MingmingCui
 * @Description: 可透支的卡
 * @Date:17:32 2019-11-20
 */
public class CheckAccount extends Account{
    private double overDraft; //可透支额度

    public double getOverDraft() {
        return overDraft;
    }

    public CheckAccount(int id, double balance, double annuallnterstRate, double overDraft) {
        super(id, balance, annuallnterstRate);
        this.overDraft = overDraft;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= getBalance()){//余额够了
            //方式一：
            //setBalance(getBalance() - amount);
            //方式二：使用父类的取款方法
            super.withdraw(amount);
        }else if (overDraft >= amount - getBalance()){
            overDraft -= amount - getBalance();
            super.withdraw(getBalance());
        }else {
            System.out.println("超过可透支限额！");
        }

    }
}
