package hw4.decorator;

class Fries implements FoodItem {
    public String getDescription() {
        return "Fries";
    }

    public double getCost() {
        return 2.50;
    }
}