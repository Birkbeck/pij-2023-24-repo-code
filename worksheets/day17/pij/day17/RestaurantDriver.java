package pij.day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class RestaurantDriver {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(3);
        List<String> dishes = List.of(
                "Avocado", "Bun", "Chips", "", "Pizza", "Rice", "Spaghetti", "Tomatoes"
        );

        List<Future<Meal>> futures = new ArrayList<>();
        for (String dish : dishes) {
            Future<Meal> future = restaurant.order(dish);
            futures.add(future);
        }

        // TODO
    }
}
