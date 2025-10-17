package hw4.bridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private NotificationChannel email;
    private NotificationChannel sms;
    private NotificationChannel push;

    @BeforeEach
    void setUp() {
        email = new EmailChannel();
        sms   = new SMSChannel();
        push  = new PushChannel();
    }

    @Test
    void testOnlinePaymentWithEmail() {
        Payment payment = new OnlinePayment(email);
        assertDoesNotThrow(() -> payment.processPayment());
    }

    @Test
    void testOnlinePaymentWithSMS() {
        Payment payment = new OnlinePayment(sms);
        assertDoesNotThrow(() -> payment.processPayment());
    }

    @Test
    void testCashPaymentWithEmail() {
        Payment payment = new CashPayment(email);
        assertDoesNotThrow(() -> payment.processPayment());
    }

    @Test
    void testCashPaymentWithSMS() {
        Payment payment = new CashPayment(sms);
        assertDoesNotThrow(() -> payment.processPayment());
    }

    @Test
    void testBitcoinPaymentWithPushChannel() {
        Payment payment = new BitcoinPayment(push);
        assertDoesNotThrow(() -> payment.processPayment());
    }

    @Test
    void testBitcoinPaymentWithEmailChannel() {
        Payment payment = new BitcoinPayment(email);
        assertDoesNotThrow(() -> payment.processPayment());
    }
}
