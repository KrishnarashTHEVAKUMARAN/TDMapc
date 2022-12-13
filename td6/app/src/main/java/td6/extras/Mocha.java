package td6.extras;

import td6.Beverage;
import td6.Extra;

public class Mocha extends Extra {
    public Mocha(Beverage inner) {
        super(inner);
    }

    @Override
    protected String getDescription() {
        return null;
    }

    @Override
    protected double cost() {
        return 2.1;
    }
}
