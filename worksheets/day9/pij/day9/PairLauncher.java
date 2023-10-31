package pij.day9;

public class PairLauncher {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Hello", 8);
        String s = p1.getX();
        Integer i = p1.getY();
        Pair<Integer, String> p2 = p1.swap();
        Pair<Integer, String> p3 = new Pair<>(p2);
        System.out.println(s + ", " + i);
        System.out.println(p2.getX() + ", " + p2.getY());
        System.out.println(p3.getX() + ", " + p3.getY());

        //p2 = new Pair<Object, String>(new Object(), "");

        // Now possible (before it was not):
        Pair<Object, String> p4 = new Pair<>(p3);
    }
}
