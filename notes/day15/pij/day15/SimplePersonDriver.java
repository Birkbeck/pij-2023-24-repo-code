package pij.day15;

import java.util.ArrayList;
import java.util.List;

public class SimplePersonDriver {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new SimplePerson("Alice", 20),
                new SimplePerson("Bob", 15),
                new SimplePerson("Carol", 42));
        long count = Person.getAdultCount(persons);
        List<String> adults = Person.getAdultNames(persons);
        System.out.println("There are " + count + " adults: " + adults);
    }
}
