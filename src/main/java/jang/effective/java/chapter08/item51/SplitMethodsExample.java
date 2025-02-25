package jang.effective.java.chapter08.item51;

public class SplitMethodsExample {

    public void processOrder(String customerName, String customerAddress, String productName, int quantity, double price, String paymentMethod) {

    }

    public void processOrder(Order order) {
        validateOrder(order);
        processPayment(order);
        shipOrder(order);
    }

    private void validateOrder(Order order) {

    }

    private void processPayment(Order order) {

    }

    private void shipOrder(Order order) {

    }

    public static void main(String[] args) {
        Order order = new Order("John Doe", "1", "2", 3, 3.0, "apple");
        SplitMethodsExample example = new SplitMethodsExample();
        example.processOrder(order);
    }

}

class Order {
    private String customerName;
    private String customerAddress;
    private String productName;
    private int quantity;
    private double price;
    private String paymentMethod;

    public Order(String customerName, String customerAddress, String productName, int quantity, double price, String paymentMethod) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.paymentMethod = paymentMethod;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
