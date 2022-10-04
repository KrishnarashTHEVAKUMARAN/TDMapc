package td1.step5.api.burger;

import td1.step5.api.restauration.Base;

public enum BurgerIngredient implements Base {
    CHEDDAR, DEEPFRIEDONIONS, TOMATO;

    @Override
    public double calories_per_100g() {
        double cal;
        switch (this) {
            case CHEDDAR:
                cal = 400;
                break;
            case DEEPFRIEDONIONS:
                cal = 590;
                break;
            case TOMATO:
            default:
                cal = 21;
        }
        return cal;
    }

    @Override
    public double price() {
        double price;
        switch (this) {
            case CHEDDAR:
                price = 4;
                break;
            case DEEPFRIEDONIONS:
                price = 1.5;
                break;
            case TOMATO:
            default:
                price = 0.5;
        }
        return price;
    }

    public boolean hasUniquePrice() {
        return false;
    }

    @Override
    public String toString() {
        String type;
        switch (this) {
            case CHEDDAR:
                type = "cheddar";
                break;
            case DEEPFRIEDONIONS:
                type = "deep fried onions";
                break;
            case TOMATO:
            default:
                type = "tomato";
        }
        return type;
    }
}