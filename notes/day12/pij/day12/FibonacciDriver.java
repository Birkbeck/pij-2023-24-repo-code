package pij.day12;

public class FibonacciDriver {
    public static void main(String[] args) {
        int input = 6;
        long result = Fibonacci.fib(input);
        System.out.println("fib(" + input + ") = " + result);
    }
}
