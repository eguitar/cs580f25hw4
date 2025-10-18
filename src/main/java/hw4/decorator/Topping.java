package hw4.decorator;

abstract class Topping implements FoodItem {
    protected FoodItem foodItem;

    public Topping(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public String getDescription() {
        return foodItem.getDescription();
    }

    public double getCost() {
        return foodItem.getCost();
    }
}