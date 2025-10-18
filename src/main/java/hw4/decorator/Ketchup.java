package hw4.decorator;

class Ketchup extends Topping {
    public Ketchup(FoodItem foodItem) {
        super(foodItem);
    }

    public String getDescription() {
        return super.getDescription() + ", Ketchup";
    }

    public double getCost() {
        return super.getCost() + 0.25;
    }
}