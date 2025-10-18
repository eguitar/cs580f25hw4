package hw4.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoyaltyStatusTest {

    @Test
    void testRegularDiscount() {
        double total = 100.0;
        double result = LoyaltyStatus.applyDiscount(total, LoyaltyStatus.Status.REGULAR);
        assertEquals(100.0, result, 0.001);
    }

    @Test
    void testSilverDiscount() {
        double total = 100.0;
        double result = LoyaltyStatus.applyDiscount(total, LoyaltyStatus.Status.SILVER);
        assertEquals(90.0, result, 0.001);
    }

    @Test
    void testGoldDiscount() {
        double total = 100.0;
        double result = LoyaltyStatus.applyDiscount(total, LoyaltyStatus.Status.GOLD);
        assertEquals(80.0, result, 0.001);
    }
}
