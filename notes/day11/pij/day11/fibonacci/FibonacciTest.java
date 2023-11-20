package pij.day11.fibonacci;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    private static void testFib_helper(int expected, int input) {
        FibonacciTry1 f = new FibonacciTry1();
        long actual = f.fib(input);
        assertEquals(expected, actual);

    }
    @Test
    public void testFib_zero() {
        int input = 0;
        FibonacciTry1 f = new FibonacciTry1();
        long actual = f.fib(input);
        long expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testFib_one() {
        int input = 1;
        FibonacciTry1 f = new FibonacciTry1();
        long actual = f.fib(input);
        long expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testFib_two() {
        testFib_helper(1, 2);
    }

    @Test
    public void testFib_IllegalArgument() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    int input = -1;
                    FibonacciTry1 f = new FibonacciTry1();
                    f.fib(input);
                });
    }

    @Test
    public void testFib_fortySix() {
        testFib_helper(1836311903, 46);
    }

    @Test
    public void testFib_fortySix_oneSecond() {
        assertTimeout(Duration.ofSeconds(1),
                () -> {
                     testFib_helper(1836311903, 46);
                });
    }

    @Test
    public void testFib_fortySix_oneSecond_preemptively() {
        assertTimeoutPreemptively(Duration.ofSeconds(1),
                () -> {
                    testFib_helper(1836311903, 46);
                });
    }

}
