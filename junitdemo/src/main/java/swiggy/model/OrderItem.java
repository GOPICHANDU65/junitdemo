package swiggy.model;

public class OrderItem {
    Product product;
    private int quantity;
    private int price;

    public OrderItem(Product product, int quantity, int price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price=quantity*product.getPrice();
    }

}