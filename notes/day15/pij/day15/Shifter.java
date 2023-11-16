package pij.day15;

/**
 * Provides a method that shifts its parameter by a fixed constant.
 * The constant is fixed when the Shifter object is constructed.
 */
public class Shifter {

    private final int shift;

    public Shifter(int shift) {
        this.shift = shift;
    }

    public int shift(int value) {
        return value + this.shift;
    }

    public int getShift() {
        return this.shift;
    }

    @Override
    public String toString() {
        return "Shifter with a shift of: " + this.shift;
    }

    public int[] shiftAll(int[] data) {
        return ArrayMapper.map(this::shift, data);
    }

    public static int[] shiftAll(Shifter s, int[] data) {
        return ArrayMapper.map(s::shift, data);
    }

    public static void sortShifters(Shifter[] shifters) {
        java.util.Arrays.sort(shifters, (s1, s2) -> s1.getShift() - s2.getShift());
    }
}
