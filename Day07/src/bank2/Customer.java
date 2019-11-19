package bank2;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:10:31 2019-11-19
 */
public class Customer {
    private String firstName;
    private String  lastName;
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
