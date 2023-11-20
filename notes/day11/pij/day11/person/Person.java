package pij.day11.person;

import java.util.Objects;

/**
 * Represents a person with a full name that can be queried for their initials.
 */
public class Person {
    /** The person's full name. Must not be null after object construction. */
    private String fullName;

    /**
     * Constructs a new Person.
     *
     * @param fullName the person's full name, with components separated
     *                 by spaces
     * @throws NullPointerException if fullName is null
     */
    public Person(String fullName) {
        //this.fullName = fullName; // first try
        this.fullName = Objects.requireNonNull(fullName, "fullName must not be null!");
        /*
        // shorthand for
        if (fullName == null) {
            throw new NullPointerException("fullName must not be null!");
        }
        this.fullName = fullName;
         */
    }

    /**
     * Returns this person's initials based on their full name.
     *
     * @return this person's initials based on their full name
     */
    public String getInitials() {
        String result = "";
        String[] words = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                String nextInitial = "" + words[i].charAt(0);
                result = result + nextInitial.toUpperCase();
            }
        }
        return result;
    }
}
