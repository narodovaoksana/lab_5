package task2;
import java.util.List;
import task2.Item;

public class PriceCalculator {
    public double calculateTotalPrice(List<Item> items) {
        double totalPrice = 0.0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}