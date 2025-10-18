package hw4.decorator;

class Cheese extends Topping {
    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }

    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    public double getCost() {
        return super.getCost() + 1.00;
    }
}