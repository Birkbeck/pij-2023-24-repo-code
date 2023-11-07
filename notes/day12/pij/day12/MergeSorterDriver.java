package pij.day12;

import java.util.Arrays;

public class MergeSorterDriver {
    public static void main(String[] args) {
        //int[] arr = { 3, 7, 2, 9, 1 };
        int[] arr = { 3, 7, 2, 9, 1, 5, 8, 4, 2, 8, 0, 3 };
        MergeSorter.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
