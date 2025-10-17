package hw4.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    @Test
    void testOnlinePaymentInstance() {
        Payment online = new OnlinePayment(new EmailChannel());
        assertNotNull(online);
    }

    @Test
    void testCashPaymentInstance() {
        Payment cash = new CashPayment(new SMSChannel());
        assertNotNull(cash);
    }

    @Test
    void testBitcoinPaymentInstance() {
        Payment bitcoin = new BitcoinPayment(new PushChannel());
        assertNotNull(bitcoin);
    }

    @Test
    void testProcessPayment() {
        NotificationChannel email = new EmailChannel();
        Payment online = new OnlinePayment(email);
        assertDoesNotThrow(() -> online.makePayment(100.00));
    }

    @Test
    void testDifferentChannels() {
        Payment bitcoinViaSms = new BitcoinPayment(new SMSChannel());
        Payment cashViaPush = new CashPayment(new PushChannel());
        assertNotNull(bitcoinViaSms);
        assertNotNull(cashViaPush);
    }
}
