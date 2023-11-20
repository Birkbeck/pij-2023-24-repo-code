package pij.day11;

public class StringExperiments {

    public static String build(int max) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < max; i++) {
            s.append(i);
        }
        return s.toString();
    }
}
