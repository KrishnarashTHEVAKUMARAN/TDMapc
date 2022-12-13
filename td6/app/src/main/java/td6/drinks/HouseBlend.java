package td6.drinks;

import td6.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 4;
    }
}