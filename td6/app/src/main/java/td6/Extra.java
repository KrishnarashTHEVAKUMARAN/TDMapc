package td6;

public abstract class Extra {
    private Beverage component;
    private String description;
    private double cost;

    public Extra(Beverage inner) {
        this.component = inner;
    }

    protected abstract String getDescription();
    protected abstract double cost();
}