package hw4.decorator;

class LoyaltyStatus {
    public enum Status {
        REGULAR, SILVER, GOLD
    }

    public static double applyDiscount(double total, Status status) {
        switch (status) {
            case SILVER:
                return total * 0.90;
            case GOLD:
                return total * 0.80;
            default:
                return total;
        }
    }
}
