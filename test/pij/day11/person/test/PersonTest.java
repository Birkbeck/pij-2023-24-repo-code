package pij.day11.person.test;

import org.junit.jupiter.api.Test;
import pij.day11.person.Person;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    /** Duration to use for the time-sensitive tests of this class. */
    private static final int TEST_DURATION_MILLIS = 1000;

    @Test
    public void testGetInitials_ThreeWordName() {
        String input = "Derek Robert Yeast";
        Person p = new Person(input);
        String actual = p.getInitials();
        String expected = "DRY";
        assertEquals(expected, actual, "three-word name, single space separator");
    }

    @Test
    public void testThatFinishedBeforeOneSecond() {
        assertTimeout(Duration.ofMillis(TEST_DURATION_MILLIS),
                () -> {
                    String input = "Derek Robert Yeast";
                    Person p = new Person(input);
                    p.getInitials();
                });
    }

    @Test
    public void testThatFinishedBeforeOneSecondPreemptively() {
        assertTimeoutPreemptively(Duration.ofMillis(TEST_DURATION_MILLIS),
                () -> {
                    String input = "Derek Robert Yeast";
                    Person p = new Person(input);
                    p.getInitials();
                });
    }

    @Test
    public void testIllegalNullArgumentForConstructor() {
        assertThrows(NullPointerException.class,
                () -> {
                    String input = null;
                    Person p = new Person(input); // null should lead to NPE
                });
    }

    @Test
    public void testGetInitials_ThreeWordNameDoubleSpace() {
        String input = "Derek  Robert Yeast";
        Person p = new Person(input);
        String actual = p.getInitials();
        String expected = "DRY";
        assertEquals(expected, actual, "three-word name, double space separator");
    }

    @Test
    public void testGetInitials_ThreeWordNameTripleSpace() {
        String input = "Derek   Robert Yeast";
        Person p = new Person(input);
        String actual = p.getInitials();
        String expected = "DRY";
        assertEquals(expected, actual, "three-word name, triple space separator");
    }

    // In a "real" testing class, there are usually
    // more methods here, each of them annotated with
    // the annotation @Test, each of them testing
    // a different aspect of the code
}
