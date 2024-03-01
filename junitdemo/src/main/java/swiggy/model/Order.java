package swiggy.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<OrderItem> orderItemList = new ArrayList<>();

    private double price;

    private double serviceCharges;
    private int tipAmount;
    private  String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public Order(double price, int tipAmount, double serviceCharges,String status) {
        this.price = price;
        this.tipAmount = tipAmount;
        this.serviceCharges = serviceCharges;
        this.status=status;
    }

    public void addItem(OrderItem item){
        orderItemList.add(item);
        price=price+item.getPrice();
    }
    public void removeItem(OrderItem item){
        orderItemList.remove(item);
        price=price-item.getPrice();
}


    public double getPrice() {
        return price;
    }

    public int getTipAmount() {
        return tipAmount;
    }

    public double getServiceCharges() {
        return serviceCharges;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setServiceCharges(double serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    public void setTipAmount(int tipAmount) {
        this.tipAmount = tipAmount;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }
}
