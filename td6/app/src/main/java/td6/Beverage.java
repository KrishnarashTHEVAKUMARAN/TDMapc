package td6;

public abstract class Beverage {
    private String description;
    private double cost;

    protected abstract String getDescription();
    protected abstract double cost();
}