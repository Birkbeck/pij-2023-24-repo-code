package pij.day14;


public class Fibonacci {

    // Fibonacci number are always non-negative
    private static final long UNKNOWN = -1;

    public static long fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Illegal negative value " + n);
        }
        long[] precalculated = initPrecalculatedArray(n+1);
        return fib(n, precalculated);
    }

    private static long fib(int n, long[] precalculated) {
        if (precalculated[n] != UNKNOWN) {
            return precalculated[n];
        }
        long result = fib(n - 1, precalculated) + fib(n - 2, precalculated);
        precalculated[n] = result;
        return result;
    }

    private static long[] initPrecalculatedArray(int size) {
        long[] precalculated = new long[size];
        for (int i = 2; i < precalculated.length; i++) {
            precalculated[i] = UNKNOWN;
        }
        if (precalculated.length > 0) {
            precalculated[0] = 0; // F(0)
        }
        if (precalculated.length > 1) {
            precalculated[1] = 1; // F(1)
        }
        return precalculated;
    }
}

