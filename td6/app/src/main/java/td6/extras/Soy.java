package td6.extras;

import td6.Beverage;
import td6.Extra;

public class Soy extends Extra {
    public Soy(Beverage inner) {
        super(inner);
    }

    @Override
    protected String getDescription() {
        return null;
    }

    @Override
    protected double cost() {
        return 2.3;
    }
}