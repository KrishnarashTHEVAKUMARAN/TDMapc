package td1.refactor.api.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BurgerAdvisor {

    private static BurgerAdvisor instance = null;

    private static Map<Tariff, List<BurgerRestaurant>> map = new HashMap<>();

    private BurgerAdvisor() {
    }

    public static BurgerAdvisor instance() {
        if (instance == null) {
            instance = new BurgerAdvisor();
        }
        return instance;
    }

    public static void register(Tariff tariff, BurgerRestaurant restaurant) {
        if (!map.containsKey(tariff)) {
            map.put(tariff, new ArrayList<>());
        }
        map.get(tariff).add(restaurant);
    }

    public BurgerRestaurant select(Tariff tariff) {
        return map.get(tariff).get(0);
    }
}
