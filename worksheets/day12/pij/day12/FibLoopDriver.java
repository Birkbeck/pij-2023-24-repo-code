package pij.day12;

public class FibLoopDriver {
    public static void main(String[] args) {
        int input = 6;
        long result = FibLoop.fibIterative(input);
        System.out.println("fib(" + input + ") = " + result);
    }
}
