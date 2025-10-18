package hw4.bridge;

public class EmailChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("[ Email ]\n" + message);
    }
}