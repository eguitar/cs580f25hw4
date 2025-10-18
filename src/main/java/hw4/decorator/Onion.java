package hw4.decorator;

class Onions extends Topping {
    public Onions(FoodItem foodItem) {
        super(foodItem);
    }

    public String getDescription() {
        return super.getDescription() + ", Onions";
    }

    public double getCost() {
        return super.getCost() + 0.50;
    }
}