package hw4.bridge;

public class SMSChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("[SMS]\n" + message);
    }
}