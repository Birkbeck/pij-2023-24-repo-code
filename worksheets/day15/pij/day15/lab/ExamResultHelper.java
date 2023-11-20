package pij.day15.lab;

import java.util.ArrayList;
import java.util.List;

public class ExamResultHelper {
    public static int getRandom(int max) {
        return (int) (Math.round(Math.random() * max));
    }
    public static List<ExamResult> makeLargeTestData() {
        final int SIZE = 20000000;
        final int MAX_MARK = 100;
        final int MAX_NAME_SUFFIX = 400;
        final String NAME_PREFIX = "Student";
        final String MODULE = "PiJ";
        List<ExamResult> result = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            int randomMark = getRandom(MAX_MARK);
            int randomSuffix = getRandom(MAX_NAME_SUFFIX);
            ExamResult examResult = new ExamResult(NAME_PREFIX + randomSuffix,
                    MODULE, randomMark);
            result.add(examResult);
        }
        return result;
    }

    public static List<ExamResult> makeTestData() {
        return List.of(
                new ExamResult("Harry", "FoC", 46),
                new ExamResult("Sally", "FoC", 82),
                new ExamResult("Sally", "PiJ", 76),
                new ExamResult("Alice", "PiJ", 80),
                new ExamResult("Bob", "PiJ", 68),
                new ExamResult("Bob", "FoC", 58)
        );
    }
}
