
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FoodOrderingSystem {
    public static void main(String[] args) {
        List<Restaurant> restaurants = RestaurantService.restaurantList();
        System.out.println("*************MENU**************");
        restaurants.forEach(restaurant -> {
            Map<String, Double> menuList = restaurant.getMenuList();
            Set<String> menus = menuList.keySet();
            menus.forEach(m -> System.out.println(m));
        });
        while (true) {
            System.out.println("****choose from the menu********");
            Scanner sc = new Scanner(System.in);
            String order = sc.nextLine();

            getOrder(order);
        }

    }

    private static void getOrder(String menu) {
        List<Restaurant> restaurants = RestaurantService.restaurantList();
        restaurants.forEach(restaurant -> {
            if (restaurant.getMenuList().get(menu) != null) {
                System.out.println(restaurant.getName() + ", " + menu + ", " + restaurant.getMenuList().get(menu));
                return;
            }
        });
    }
}
