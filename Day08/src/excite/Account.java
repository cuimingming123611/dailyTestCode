package excite;

/**
 * @Author: MingmingCui
 * @Description:    继承性的总和练习，通过卡的类进行练习
 * @Date:17:17 2019-11-20
 */
public class Account {
    private int id;//卡号
    private double balance;//账户余额
    private double annuallnterstRate; //年利率

    public Account() {

    }

    public Account(int id, double balance, double annuallnterstRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterstRate = annuallnterstRate;
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

    public double getAnnuallnterstRate() {
        return annuallnterstRate;
    }

    public void setAnnuallnterstRate(double annuallnterstRate) {
        this.annuallnterstRate = annuallnterstRate;
    }

    public double getMothlyInteresRate(){

        /**
        * @Description: 获得月利率
         * @param
        * @return: double
        * @Author: MingmingCui
        * @Date: 2019-11-20 17:30
        */
        return annuallnterstRate / 12;
    }
    public void withdraw(double amount){

        /**
        * @Description: 取款操作
         * @param amount
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-20 17:24
        */
        if (amount <= 0){
            System.out.println("取款金额不能小于或者等于0");
            return;
        }else if (amount > getBalance()){
            System.out.println("账户余额不足，取款失败！");
            return;
        }
        balance -= amount;
    }

    public void deposit(double amount){

        /**
        * @Description: 存款操作
         * @param amount
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-20 17:24
        */
        if (amount <= 0){
            System.out.println("存款金额不能小于或者等于0");
            return;
        }
        balance += amount;
    }


}
