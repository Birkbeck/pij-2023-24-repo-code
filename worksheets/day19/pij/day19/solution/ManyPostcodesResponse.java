package pij.day19.solution;

import java.util.Arrays;

/**
 * For Exercise 1.8.
 */
public class ManyPostcodesResponse {
    private int status;
    private ManyPostcodesEntry[] result;

    @Override
    public String toString() {
        return "ManyPostcodesResponse{" +
                "status=" + status +
                ", result=" + Arrays.toString(result) +
                '}';
    }
}
