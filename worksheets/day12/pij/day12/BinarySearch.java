package pij.day12;

import java.util.List;

public class BinarySearch {
    public static <E extends Comparable<E>> boolean find(List<E> sortedList, E value) {
        System.out.println("Call on: " + sortedList);
        if (sortedList.size() == 0) {
            return false;
        }
        if (sortedList.size() == 1) {
            return sortedList.get(0).equals(value);
        }
        // recursive case: make the problem smaller
        int middle = sortedList.size() / 2;
        int comparisonResult = sortedList.get(middle).compareTo(value);
        if (comparisonResult == 0) {
            return true;
        }
        List<E> smaller;
        if (comparisonResult < 0) {
            // value must be after the middle
            smaller = sortedList.subList(middle, sortedList.size());
        } else {
            // value must be before the middle
            smaller = sortedList.subList(0, middle);
        }
        return find(smaller, value);
    }
}
