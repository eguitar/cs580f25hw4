package hw4.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testFullCustomerOrderIntegration() {
        FoodItem burger = new Cheese(new Ketchup(new Burger()));
        FoodItem fries = new Ketchup(new Fries());
        FoodItem hotDog = new Onions(new Cheese(new HotDog()));

        CustomerOrder order = new CustomerOrder();
        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotDog);

        double subtotal = order.calculateTotal();
        assertEquals(14.25, subtotal, 0.001);

        double discountedTotal = LoyaltyStatus.applyDiscount(subtotal, LoyaltyStatus.Status.GOLD);
        assertEquals(11.4, discountedTotal, 0.001);
    }
}
