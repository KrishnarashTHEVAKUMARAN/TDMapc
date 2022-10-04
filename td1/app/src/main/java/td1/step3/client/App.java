package td1.step3.client;

import td1.step3.api.burger.Burger;
import td1.step3.api.restauration.Ingredient;

import java.util.Arrays;
import java.util.List;

import static td1.step3.api.burger.BurgerBase.*;

public class App {
    public static void main(String args[]) {
        Burger alice_dinner = new Burger("Fishy Step3",
                Arrays.asList(new Ingredient(WHITEFISH, 50), new Ingredient(BEARNAISE, 40)));
        Burger bob_dinner = new Burger("Beefy",
                Arrays.asList(new Ingredient(BEEF, 100), new Ingredient(BURGER, 40),
                        new Ingredient(DEEPFRIEDONIONS, 10), new Ingredient(CHEDDAR, 15),
                        new Ingredient(DEEPFRIEDONIONS, 10), new Ingredient(CHEDDAR, 15)));
        Burger charles_dinner = new Burger("Own Style",
                Arrays.asList(new Ingredient(BEEF, 400), new Ingredient(DEEPFRIEDONIONS, 20),
                        new Ingredient(CHEDDAR, 30), new Ingredient(BARBECUE, 20),
                        new Ingredient(BEARNAISE, 20), new Ingredient(BURGER, 20),
                        new Ingredient(CHEDDAR, 30)));
        List<Burger> dinners = Arrays.asList(alice_dinner, bob_dinner, charles_dinner);
        for (Burger dinner : dinners) {
            System.out.println(dinner);
        }
    }
}