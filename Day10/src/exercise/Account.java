package exercise;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:10:39 2019-11-22
 */
public class Account {
    private String id; //银行卡号，自动生成
    private String name; //卡主姓名
    private String identityCard; //身份证
    private String pwd = "000000"; //密码
    private double balance; //余额

    private static double interestRate; //年利率
    private static double minMoney; //最小金额

    private static String init = "6254370000000000"; //初始卡号

    public String getId() {
        return id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    public String getName() {
        return name;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    private Account() {
        id = init;
        long l = Long.parseLong(id);
        l++;
        init = String.valueOf(l);

        balance = 0.00;

    }

    public Account(String name, String identityCard, String pwd) {

        /**
         * @Description: 带参数的构造器
         * @param name
         * @param identityCard
         * @param pwd
         * @return:
         * @Author: MingmingCui
         * @Date: 2019-11-22 10:57
         */
        this();
        this.name = name;
        this.identityCard = identityCard;
        this.pwd = pwd;

    }

}
