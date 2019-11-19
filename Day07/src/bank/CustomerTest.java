package bank;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:09:34 2019-11-19
 */
public class CustomerTest {
    public static void main(String args[]) {
        Customer customer = new Customer("Jane","Smith");
        Account account = new Account(1000,2000,0.0123);
        customer.setAccount(account);

        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        System.out.println(customer.getFirstName() + customer.getLastName() + "has a account: id is "+customer.getAccount().getId() + " ， balance is " + customer.getAccount().getBalance()+" , annualInterestRate is "+customer.getAccount().getAnnualInterestRate()+" .");



    }
}
