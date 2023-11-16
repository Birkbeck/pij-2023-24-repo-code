package pij.day15;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public interface Person {

    // ... further details omitted, could also be a class ...

    String getName();
    int getAge();

    public static long getAdultCount(Collection<? extends Person> collection) {
        final int MIN_ADULT_AGE = 18;
        return collection.stream()
                .filter(p -> p.getAge() >= MIN_ADULT_AGE)
                .count();
    }

    public static List<String> getAdultNames(Collection<? extends Person> collection) {
        final int MIN_ADULT_AGE = 18;
        return collection.stream()
                .filter(p -> p.getAge() >= MIN_ADULT_AGE)
                .map(Person::getName)
                .collect(Collectors.toList());
    }

}

