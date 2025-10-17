package hw4.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificationChannelTest {

    @Test
    void testEmailChannelInstance() {
        NotificationChannel email = new EmailChannel();
        assertNotNull(email);
    }

    @Test
    void testSMSChannelInstance() {
        NotificationChannel sms = new SMSChannel();
        assertNotNull(sms);
    }

    @Test
    void testPushChannelInstance() {
        NotificationChannel push = new PushChannel();
        assertNotNull(push);
    }
}
