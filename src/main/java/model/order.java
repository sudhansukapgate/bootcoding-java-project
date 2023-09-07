package model;

public class order {
    int id;
    String deliveryAddress;
    Date orderDate;
    double amount;
    String restraurent;
    String customerNAme;

    public String getCustomerNAme() {
        return customerNAme;
    }

    public void setCustomerNAme(String customerNAme) {
        this.customerNAme = customerNAme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRestraurent() {
        return restraurent;
    }

    public void setRestraurent(String restraurent) {
        this.restraurent = restraurent;
    }
}
