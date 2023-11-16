package pij.day15;

public class ArrayMapper {
    public static int[] map(IntToIntFunction f, int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = f.apply(data[i]);
        }
        return result;
    }
}
