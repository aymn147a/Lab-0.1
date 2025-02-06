package org;

public class Order {
    private int Orderid;
    private String OrderStatus;

    public Order(int orderid) {
        Orderid = orderid;
    }

    public Order(String orderStatus) {
        OrderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        OrderStatus = orderStatus;
    }

    public int getOrderid() {
        return Orderid;
    }

    public void setOrderid(int orderid) {
        Orderid = orderid;
    }
}
