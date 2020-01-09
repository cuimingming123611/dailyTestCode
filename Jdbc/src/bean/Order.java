package bean;

import java.sql.Date;

/**
 * @author: CuiMingming
 * @Description:
 * @date: 2020-01-09 11:30
 */
public class Order {
    private int orderId;
    private String orderName;
    private Date orderData;

    public Order() {
    }

    public Order(int orderId, String orderName, Date orderData) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderData = orderData;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", orderData=" + orderData +
                '}';
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int id) {
        this.orderId = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Date getOrderData() {
        return orderData;
    }

    public void setOrderData(Date orderData) {
        this.orderData = orderData;
    }

}
