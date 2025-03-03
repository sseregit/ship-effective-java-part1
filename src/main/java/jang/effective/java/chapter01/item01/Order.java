package jang.effective.java.chapter01.item01;

public class Order {

    private boolean prime;
    private boolean urgent;
    private Product product;
    private OrderStatus orderStatus;

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
        for (OrderStatus value : OrderStatus.values()) {
            System.out.println(value);
        }

        Order order = new Order();
        if (order.orderStatus == OrderStatus.DELIVERED) {
            System.out.println("delivered");
        }
    }
}
