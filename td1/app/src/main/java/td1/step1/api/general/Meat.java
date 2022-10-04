package td1.step1.api.general;

public class Meat implements FoodProduct {

    @Override
    public double calories_per_100g() {
        double cal;
        if (type == MeatType.BEEF){
            cal = 200;
        }else if (type == MeatType.WHITEFISH){
            cal = 170;
        }else{
            cal = 0;
        }
        return cal;
    }

    @Override
    public double calories() {
        return (calories_per_100g()/100)*weight;
    }

    public enum MeatType {
        BEEF, WHITEFISH;
        // BEEF : 200 kcal / 100g
        // WHITEFISH : 170 kcal / 100g

        public double price() {
            double price;
            switch (this) {
                case WHITEFISH:
                    price = 6;
                    break;
                case BEEF:
                default:
                    price = 4;
            }
            return price;
        }
    }

    private MeatType type;
    private double weight;

    public Meat(MeatType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return type.price() * weight / 100;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", type, weight(), price());
    }
}
