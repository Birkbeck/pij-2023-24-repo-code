package pij.day17;

import java.util.Objects;

public class Meal {

    private final String name;

    public Meal(String name) {
        this.name = Objects.requireNonNull(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
