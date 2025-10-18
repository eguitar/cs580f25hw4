package hw4.bridge;

public class Main {
    public static void main(String[] args) {
        NotificationChannel email = new EmailChannel();
        NotificationChannel sms   = new SMSChannel();

        Payment onlineEmail = new OnlinePayment(email);
        Payment onlineSMS   = new OnlinePayment(sms);
        Payment cashEmail = new CashPayment(email);
        Payment cashSMS   = new CashPayment(sms);

        System.out.println("=== PART 1 ===");
        System.out.println("--- Online Payments ---");
        onlineEmail.processPayment();
        onlineSMS.processPayment();
        System.out.println("--- Cash Payments ---");
        cashEmail.processPayment();
        cashSMS.processPayment();

        Payment bitcoinEmail = new BitcoinPayment(email);
        Payment bitcoinSMS   = new BitcoinPayment(sms);

        System.out.println("=== PART 2 ===");
        System.out.println("--- Bitcoin Payments ---");
        bitcoinEmail.processPayment();
        bitcoinSMS.processPayment();

        NotificationChannel push  = new PushChannel();
        Payment bitcoinPush = new BitcoinPayment(push);
        Payment cashPush = new CashPayment(push);

        System.out.println("=== PART 3 ===");
        System.out.println("--- Push Notifications ---");
        bitcoinPush.processPayment();
        cashPush.processPayment();
    }
}