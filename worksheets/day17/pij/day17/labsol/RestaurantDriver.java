package pij.day17.labsol;

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

        while (!futures.isEmpty()) {
            try {
                Thread.sleep(300); // maybe introduce constant
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Iterator<Future<Meal>> iter = futures.iterator();
            while (iter.hasNext()) {
                Future<Meal> ticket = iter.next();
                if (ticket.isDone()) {
                    iter.remove();
                    try {
                        Meal meal = ticket.get();
                        System.out.println("\nEating " + meal + "!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        throw new RuntimeException(e);
                    } catch (ExecutionException e) {
                        Throwable cause = e.getCause();
                        System.out.println("\nOh dear! Something went wrong with meal preparation:");
                        System.out.println(cause.getMessage());
                    }
                }
            }
        }
        restaurant.shutdown();
    }
}
