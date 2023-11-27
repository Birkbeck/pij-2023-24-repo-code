package pij.day17.labsol;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Restaurant {

    private ExecutorService service;
    private Random random;

    public Restaurant(int nCooks) {
        this.service = Executors.newFixedThreadPool(nCooks);
        this.random = new Random();
    }

    public synchronized Future<Meal> order(String dishName) {
        int seconds = this.random.nextInt(5, 20);
        MealOrder order = new MealOrder(dishName, seconds);
        return this.service.submit(order);
    }

    public void shutdown() {
        this.service.shutdown();
    }
}
