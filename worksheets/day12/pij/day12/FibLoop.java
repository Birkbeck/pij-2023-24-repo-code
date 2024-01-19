package pij.day12;

public class FibLoop {
    public static int fibIterative(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        // n > 1: fib(n) = fib(n-2) + fib(n-1)
        int secondToLast = 0;
        int last = 1;
        int result = -1; // dummy initalisation
        for (int i = 2; i <= n; i++) {
            result = secondToLast + last; // now contains fib(i)
            secondToLast = last;
            last = result;
        }
        return result;
    }
}
