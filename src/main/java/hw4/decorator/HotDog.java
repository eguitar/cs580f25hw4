package hw4.decorator;

class HotDog implements FoodItem {
    public String getDescription() {
        return "Hot Dog";
    }

    public double getCost() {
        return 3.75;
    }
}