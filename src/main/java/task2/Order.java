package task2;

import java.util.List;

public class Order {
    private String customerName;
    private List<Item> items;
    private PriceCalculator priceCalculator;
    private OrderProcessor orderProcessor;
    private OrderStatus status; // Changed status type to OrderStatus enum

    public Order(String customerName, List<Item> items) {
        this.customerName = customerName;
        this.items = items;
        this.priceCalculator = new PriceCalculator();
        this.orderProcessor = new OrderProcessor();
    }

    public double getTotalPrice() {
        return priceCalculator.calculateTotalPrice(items);
    }

    // Modified setStatus method to accept OrderStatus enum
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void processOrder() {
        this.status = OrderStatus.PAID;
    }
}
