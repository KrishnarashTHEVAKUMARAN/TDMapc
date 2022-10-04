package td1.step2.api.restauration;

public interface WeightedFoodProduct {
    double weight();
    default double calories() {
        return 1;
    }
}
