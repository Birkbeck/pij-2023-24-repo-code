package pij.day14;

public class FibonacciFirstAttempt {
    public static long fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Illegal negative value " + n);
        }
        long[] precalculated = new long[n+1];
        for (int i = 0; i < precalculated.length; i++) {
            precalculated[i] = -1; // to indicate "not calculated yet"
        }
        return fib(n, precalculated);
    }

    private static long fib(int n, long[] precalculated) {
        if (precalculated[n] != -1) {
            return precalculated[n];
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        long result = fib(n - 1, precalculated) + fib(n - 2, precalculated);
        precalculated[n] = result;
        return result;
    }
}
