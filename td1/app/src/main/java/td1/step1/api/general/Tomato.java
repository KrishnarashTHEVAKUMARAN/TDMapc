package td1.step1.api.general;

public class Tomato implements FoodProduct {

    private double weight;
    private double BASE_PRICE = 0.5;

    public Tomato(double weight) {
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double price() {
        return BASE_PRICE * weight / 100;
    }

    @Override
    public String toString() {
        return String.format("tomato, qty: %.0f -- %.2f", weight(), price());
    }

    @Override
    public double calories_per_100g() {
        return 18;
    }

    @Override
    public double calories() {
        return (calories_per_100g()/100)*weight;
    }
}
