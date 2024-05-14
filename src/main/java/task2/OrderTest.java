package task2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    public void testCalculateTotalPrice() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", 10.0));
        items.add(new Item("Item2", 20.0));
        items.add(new Item("Item3", 30.0));
        Order order = new Order("John Doe", items);
        double totalPrice = order.getTotalPrice();
        assertEquals(60.0, totalPrice, 0.001);
    }

    @Test
    void testProcessOrder() {
        Order order = new Order("Customer", List.of(new Item("Item1", 50.0), new Item("Item2", 60.0)));
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(order);
        assertEquals(OrderStatus.PAID, order.getStatus());
    }
}
