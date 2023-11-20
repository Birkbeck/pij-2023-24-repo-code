package pij.day12;

import java.util.List;

public class BinarySearchDriver {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 5, 7, 9, 14, 16, 18, 20);
        Integer value = 17;
        System.out.println(BinarySearch.find(list, value));
    }
}
