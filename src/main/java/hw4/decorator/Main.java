package hw4.decorator;

public class Main {
    public static void main(String[] args) {
        FoodItem burger = new Burger();
        FoodItem fries = new Fries();
        FoodItem hotDog = new HotDog();

        burger = new Cheese(new Ketchup(burger));
        fries = new Ketchup(fries);
        hotDog = new Ketchup(new Onions(new Cheese(hotDog)));

        CustomerOrder order = new CustomerOrder();
        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotDog);

        System.out.println("--- Customer Order ---");
        order.showOrderDetails();

        double total = order.calculateTotal();
        double discountedTotal = LoyaltyStatus.applyDiscount(total, LoyaltyStatus.Status.GOLD);

        System.out.println("Loyalty Status: GOLD");
        System.out.println("Discounted Total: $" + discountedTotal);
    }
}
