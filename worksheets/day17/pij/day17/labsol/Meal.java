package pij.day17.labsol;

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
