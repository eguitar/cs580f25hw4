package hw4.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToppingDecoratorTest {

    @Test
    void testCheeseTopping() {
        FoodItem burger = new Cheese(new Burger());
        assertEquals(6.00, burger.getCost(), 0.001);
        assertTrue(burger.getDescription().contains("Cheese"));
    }

    @Test
    void testKetchupTopping() {
        FoodItem fries = new Ketchup(new Fries());
        assertEquals(2.75, fries.getCost(), 0.001);
        assertTrue(fries.getDescription().contains("Ketchup"));
    }

    @Test
    void testOnionsTopping() {
        FoodItem hotDog = new Onions(new HotDog());
        assertEquals(4.25, hotDog.getCost(), 0.001);
        assertTrue(hotDog.getDescription().contains("Onions"));
    }

    @Test
    void testMultipleToppingsChain() {
        FoodItem burger = new Ketchup(new Cheese(new Burger())); // Burger + Cheese + Ketchup
        assertEquals(6.25, burger.getCost(), 0.001);
        assertTrue(burger.getDescription().contains("Ketchup"));
        assertTrue(burger.getDescription().contains("Cheese"));
    }
}
