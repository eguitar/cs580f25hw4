package hw4.bridge;

public class BitcoinPayment extends Payment {

    public BitcoinPayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void processPayment() {
        channel.send("Bitcoin Payment Successful!");
    }
}