package bank2;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:10:46 2019-11-19
 */
public class Test {
    public static void main(String args[]) {
        Bank bank = new Bank();
        bank.addCustomer("Jane", "Smith");
        bank.getCustomer(0).setAccount(new Account(2000));
       // bank.getCustomer(0).getAccount().withdraw(500);
       // double balance = bank.getCustomer(0).getAccount().getBalance();
       // System.out.println("客户" + bank.getCustomer(0).getFirstName() + " " + bank.getCustomer(0).getLastName() + " 的账户余额为：" + balance);

        bank.addCustomer("崔", "明明");
        bank.getCustomer(1).setAccount(new Account(100));

        bank.addCustomer("赵", "江");
        bank.getCustomer(2).setAccount(new Account(500));

        bank.addCustomer("江","昊");
        bank.getCustomer(3).setAccount(new Account(600));

        for (int i = 0; i < bank.getNumberOfCustomer(); i++) {
            System.out.println("客户：" + bank.getCustomer(i).getFirstName() + " " + bank.getCustomer(i).getLastName() + "\t账户余额： " + bank.getCustomer(i).getAccount().getBalance());
        }
    }
}
