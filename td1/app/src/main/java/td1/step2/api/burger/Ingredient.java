package td1.step2.api.burger;

import td1.step2.api.restauration.WeightedFoodProduct;

public class Ingredient implements WeightedFoodProduct {
    private FoodType type;
    private double weight;

    public Ingredient(FoodType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public double calories_per_100g() {
        return type.calories_per_100g()/100*weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    public double price() {
        return type.hasUniquePrice() ? type.price() : weight / 100 * type.price();
    }

    public boolean hasUniquePrice() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f", this.type, weight(), price());
    }

}
