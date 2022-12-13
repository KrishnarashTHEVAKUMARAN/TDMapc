package td6.drinks;

import td6.Beverage;

public class Decaf extends Beverage {
    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 2.5;
    }
}