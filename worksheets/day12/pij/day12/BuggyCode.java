package pij.day12;

public class BuggyCode {
    public static String buggyMethod(int n) {
        //if (n == 0) {
        if (n <= 0) {
            return "";
        }
        return n + " " + buggyMethod(n-2);
    }
}
