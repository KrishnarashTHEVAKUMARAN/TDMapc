package td1.refactor.api.general;

public enum MeatType implements FoodConstituent {
    BEEF, WHITEFISH;

    @Override
    public double calories_per_100g() {
        double cal;
        switch (this) {
            case WHITEFISH:
                cal = 170;
                break;
            case BEEF:
            default:
                cal = 200;
        }
        return cal;
    }

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
