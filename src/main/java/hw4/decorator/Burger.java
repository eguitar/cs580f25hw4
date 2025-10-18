package hw4.decorator;

class Burger implements FoodItem {
    public String getDescription() {
        return "Burger";
    }

    public double getCost() {
        return 5.00;
    }
}