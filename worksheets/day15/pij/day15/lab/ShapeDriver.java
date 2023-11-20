package pij.day15.lab;

public class ShapeDriver {
    public static void main(String[] args) {
        OneDimensionalShape s1 = () -> 2.5; // yes, although it is not too exciting
        TwoDimensionalShape s2 = null; // no, it is not a functional interface (2 abstract methods)
        System.out.println(s1.getHeight());
    }
}
