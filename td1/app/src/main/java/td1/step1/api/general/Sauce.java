package td1.step1.api.general;

public class Sauce implements FoodProduct {

    @Override
    public double calories_per_100g() {
        double cal;
        if (type == SauceType.BURGER){
            cal = 240;
        }else if (type == SauceType.BARBECUE){
            cal = 130;
        }else if (type == SauceType.BEARNAISE){
            cal = 550;
        }else{
            cal = 0;
        }
        return cal;
    }

    @Override
    public double calories() {
        return (calories_per_100g()/100)*weight;
    }

    public static enum SauceType {
        BURGER, BARBECUE, BEARNAISE;
        // BURGER : 240 kcal / 100g
        // BARBECUE : 130 kcal / 100g
        // BEARNAISE : 550 kcal / 100g
    }

    private static double BASE_PRICE = 1;

    private SauceType type;
    private double weight;

    public Sauce(SauceType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return BASE_PRICE;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s sauce (%.0fg) -- %.2f€", type, weight(), price());
    }
}
