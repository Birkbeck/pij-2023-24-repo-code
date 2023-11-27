package pij.day17.labsol;

import java.util.concurrent.Callable;

public class MealOrder implements Callable<Meal> {

    private final String dishName;
    private final int durationSeconds;

    private static final int SLEEP_MILLIS = 200;

    public MealOrder(String dishName, int seconds) {
        this.dishName = dishName;
        this.durationSeconds = seconds;
    }

    @Override
    public Meal call() throws Exception {
        int totalDurationMillis = this.durationSeconds * 1000;
        while (totalDurationMillis > 0) {
            Thread.sleep(SLEEP_MILLIS);
            System.out.print(this.dishName.charAt(0));
            totalDurationMillis -= SLEEP_MILLIS;
        }
        return new Meal(this.dishName);
    }
}
