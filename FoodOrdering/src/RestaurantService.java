
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantService {
    public static List<Restaurant> restaurantList() {
        Map<String, Double> pizza = new HashMap<>();
        pizza.put("pepperoni pizza", 20.00);
        pizza.put("Periperi Chicken Pizza", 17.50);
        pizza.put("Mushroom Pizza", 13.00);

        Map<String, Double> burger = new HashMap<>();
        burger.put("Chicken Burger", 20.00);
        burger.put("Cheese Burger", 17.50);
        burger.put("Beef Burger", 21.00);

        return Arrays.asList(
                new Restaurant(1, pizza, "Awesome pizza place"),
                new Restaurant(2, burger, "wild burger joint"));
    }
}
