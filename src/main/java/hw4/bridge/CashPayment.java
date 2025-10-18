package hw4.bridge;

public class CashPayment extends Payment {

    public CashPayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void processPayment() {
        channel.send("Cash Payment Successful!");
    }
}