package bank;

/**
 * @Author: MingmingCui
 * @Description:  客户类
 * @Date:09:32 2019-11-19
 */
public class Customer {
    private String firstName;
    private String lastName;
    //定义一个为account类的变量
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }
}
