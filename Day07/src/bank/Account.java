package bank;

/**
 * @Author: MingmingCui
 * @Description:  银行账户信息
 * @Date:09:23 2019-11-19
 */
public class Account {
    private int id;  //账号
    private double balance;  //余额
    private double annualInterestRate; //年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount){

        /**
        * @Description: 取钱
         * @param amount
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-19 09:28
        */
        if (balance < amount){
            System.out.println("余额不足，取款失败！");
            return;
        }
        balance -= amount;
        System.out.println("成功取出"+amount+"元！");

    }

    public void deposit(double amount){

        /**
        * @Description: 存钱
         * @param amount
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-19 09:28
        */
        if (amount > 0){
            balance += amount;
            System.out.println("成功存入："+ amount+"元！");
        }
    }

}
