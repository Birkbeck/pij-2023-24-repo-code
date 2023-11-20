package pij.day12;

public class Reverse {
    public static String reverse(String s) {
        // base case
        if (s.length() <= 1) {
            return s;
        }
        if (s.length() == 2) {
            return "" + s.charAt(1) + s.charAt(0);
        }
        // recursive case: at least length 2
        String smaller = s.substring(1); // all elements from index 1 to the end
        String smallerSolution = reverse(smaller);
        String solution = smallerSolution + s.charAt(0);
        return solution;
    }
}
