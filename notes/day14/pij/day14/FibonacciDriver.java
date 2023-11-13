package pij.day14;

public class FibonacciDriver {
    public static void main(String[] args) {
        final int INPUT = 46;
        //Fibonacci fibo = new Fibonacci();
        long nanos1 = System.nanoTime();
        long result = Fibonacci.fib(INPUT);
        long nanos2 = System.nanoTime();
        System.out.println("fib(" + INPUT + ") = " + result);
        System.out.println("The computation took " + (nanos2 - nanos1)/1000 + " microseconds.");
    }
}
