package task2;

public class OrderProcessor {
    public void processOrder(Order order) {
        double totalPrice = order.getTotalPrice();
        if (totalPrice > 100.0) {
            order.setStatus(OrderStatus.PAID); // Use the OrderStatus enum value
        } else {
            order.setStatus(OrderStatus.UNPAID); // Use the OrderStatus enum value
        }
    }
}
