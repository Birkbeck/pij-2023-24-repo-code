package pij.day15.lab;

import java.util.function.DoubleUnaryOperator;

import static pij.day15.lab.DoubleRepeater.repeat;

public class DoubleRepeaterDriver {
    public static void main(String[] args) {
        final double INPUT = 256;
        final int TIMES = 3;

        // lambda expression for two times the number
        System.out.println(repeat((x) -> x*2, INPUT, TIMES));

        // Math.sqrt via lambda
        System.out.println(repeat(x -> Math.sqrt(x), INPUT, TIMES));

        // Math.sqrt via method reference (no ->)
        System.out.println(repeat(Math::sqrt, INPUT, TIMES));

        //////////////////////////////////////
        DoubleUnaryOperator doubler1= (double a) ->{
            return 2*a;
        };

        DoubleUnaryOperator doubler2 = (x) -> 2 * x;

        System.out.println(repeat(doubler1, INPUT, TIMES));
        System.out.println(repeat(doubler2, INPUT, TIMES));
        System.out.println(repeat((x) -> 2 * x, INPUT, TIMES));
    }
}
