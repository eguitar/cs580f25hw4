package hw4.bridge;

public class PushChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("[Push]\n" + message);
    }
}