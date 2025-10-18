package hw4.decorator;

import java.util.ArrayList;
import java.util.List;

class CustomerOrder {
    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.getCost();
        }
        return total;
    }

    public void showOrderDetails() {
        for (FoodItem item : items) {
            System.out.println(item.getDescription() + " - $" + item.getCost());
        }
        System.out.println("Subtotal: $" + calculateTotal());
    }
}
