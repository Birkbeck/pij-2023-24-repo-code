package pij.day10;

public class Day10Exercise1 {
    public static <E> void addElement(java.util.List<E> list, E newElement) {
        try {
            list.add(newElement);
        } catch (Exception e) {
            e.printStackTrace();
        } /*catch (NullPointerException e) {
            e.printStackTrace();
        }*/
    }
}
