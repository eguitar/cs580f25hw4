package hw4.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerOrderTest {

    @Test
    void testEmptyOrderTotal() {
        CustomerOrder order = new CustomerOrder();
        assertEquals(0.0, order.calculateTotal(), 0.001);
    }

    @Test
    void testSingleItemOrder() {
        CustomerOrder order = new CustomerOrder();
        FoodItem burger = new Cheese(new Burger());
        order.addItem(burger);

        assertEquals(6.00, order.calculateTotal(), 0.001);
    }

    @Test
    void testMultipleItemsOrder() {
        CustomerOrder order = new CustomerOrder();

        FoodItem burger = new Cheese(new Ketchup(new Burger())); // 6.25
        FoodItem fries = new Ketchup(new Fries());               // 2.75
        FoodItem hotDog = new Onions(new Cheese(new HotDog()));  // 5.25

        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotDog);

        double expectedTotal = 6.25 + 2.75 + 5.25;
        assertEquals(expectedTotal, order.calculateTotal(), 0.001);
    }
}
