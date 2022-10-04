package td1.step1.api.general;

public interface FoodProduct extends Food,Product{
    default double calories() {
        return 1;
    }
}
