package hw4.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoodItemTest {

    @Test
    void testBurgerBaseCost() {
        FoodItem burger = new Burger();
        assertEquals(5.00, burger.getCost(), 0.001);
        assertEquals("Burger", burger.getDescription());
    }

    @Test
    void testFriesBaseCost() {
        FoodItem fries = new Fries();
        assertEquals(2.50, fries.getCost(), 0.001);
        assertEquals("Fries", fries.getDescription());
    }

    @Test
    void testHotDogBaseCost() {
        FoodItem hotDog = new HotDog();
        assertEquals(3.75, hotDog.getCost(), 0.001);
        assertEquals("Hot Dog", hotDog.getDescription());
    }
}