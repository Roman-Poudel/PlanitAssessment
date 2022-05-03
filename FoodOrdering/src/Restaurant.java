
import java.util.Map;

public class Restaurant {
    private int restaurantId;
    private Map<String, Double> menuList;
    private String name;

    public Restaurant(int restaurantId, Map<String, Double> menuList, String name) {
        this.restaurantId = restaurantId;
        this.menuList = menuList;
        this.name = name;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public Map<String, Double> getMenuList() {
        return menuList;
    }

    public String getName() {
        return name;
    }
}
