package bank2;

/**
 * @Author: MingmingCui
 * @Description:  客户类
 * @Date:10:24 2019-11-19
 */
public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){

        /**
        * @Description: 存钱
         * @param amt
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-19 10:26
        */

        if (amt > 0){
            balance += amt;
            System.out.println("存钱成功！");
        }else {
            System.out.println("请输入正确的数值！");
        }

    }

    public void withdraw(double amt){

        /**
        * @Description: 取钱
         * @param amt
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-19 10:27
        */
        if (amt > 0){
            if (balance >= amt){
                balance -= amt;
                System.out.println("取钱成功!");

            }else {
                System.out.println("余额不足，取钱失败！");

            }
        }else {
            System.out.println("请输入正确的数值！");
        }


    }
}
