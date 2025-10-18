package hw4.bridge;

public class OnlinePayment extends Payment {

    public OnlinePayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void processPayment() {
        channel.send("Online Payment was Successful (Credit Card/PayPal)!");
    }
}
