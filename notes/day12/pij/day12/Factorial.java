package pij.day12;

public class Factorial {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        // recursive case:
        // (1) make the problem smaller
        int smaller = n - 1;

        // (2) solve the smaller problem
        int smallerResult = factorial(smaller);

        // (3) integrate the solution of the smaller problem to solve
        //     the original problem
        int result = n * smallerResult;
        return result;
    }
}
