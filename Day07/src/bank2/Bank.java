package bank2;

/**
 * @Author: MingmingCui
 * @Description: 银行类
 * @Date:10:33 2019-11-19
 */
public class Bank {
    private Customer[] customers;  //存放多个客户的数组
    private int  numberOfCustomer; //记录客户的个数

    public Bank(){
        customers = new Customer[10];
    }

    public void addCustomer(String firstName,String lastName){

        /**
        * @Description: 构造customer ，并把customer放入数组中
         * @param firstName
         * @param lastName
        * @return: void
        * @Author: MingmingCui
        * @Date: 2019-11-19 10:44
        */
        //通过Customer构造器，创建新的customer
        Customer customer = new Customer(firstName,lastName);
        //把新创建的customer放入customers[]的数组中
        customers[numberOfCustomer] = customer;
        //把numberOfCustomer数量+1；
        numberOfCustomer++;
    }

    public int getNumberOfCustomer() {

        /**
        * @Description: 获取客户数量
         * @param
        * @return: int
        * @Author: MingmingCui
        * @Date: 2019-11-19 10:45
        */
        return numberOfCustomer;
    }

    public Customer getCustomer(int index){

        /**
        * @Description: 索引指定位置上的客户信息
         * @param index
        * @return: bank2.Customer
        * @Author: MingmingCui
        * @Date: 2019-11-19 10:45
        */
        if (index >= 0 && index < numberOfCustomer){
            return customers[index];
        }
        return  null;
    }
}
