package pij.day15;

import java.util.List;

import static pij.day15.ExamResultHelper.makeLargeTestData;
import static pij.day15.ExamResultHelper.makeTestData;
import static pij.day15.ExamResultUtils.classificationsToResults;
import static pij.day15.ExamResultUtils.getStudents;
import static pij.day15.ExamResultUtils.getStudentsOnExam;
import static pij.day15.ExamResultUtils.getStudentsParallel;
import static pij.day15.ExamResultUtils.groupByExams;

public class ExamResultDriver {

    public static void runLarge(boolean parallel) {
        List<ExamResult> largeTestData = makeLargeTestData();
        long startTime = System.nanoTime();
        // use System.nanoTime() to measure time before and after the
        // method call, then compare
        List<String> results;
        if (parallel) {
            results = getStudentsParallel(largeTestData);
        } else {
            results = getStudents(largeTestData);
        }
        long finishTime = System.nanoTime();
        long totalTime = finishTime - startTime;
        System.out.println("Total time (ms): " + totalTime / 1000000);
    }

    public static void main(String[] args) {
        System.out.println("getStudents: " + getStudents(makeTestData()));
        System.out.println("getStudentsOnExam: "
                + getStudentsOnExam(makeTestData(), "PiJ"));
        System.out.println("groupByExams: " + groupByExams(makeTestData()));
        System.out.println("getClassificationForExam: "
                + classificationsToResults(makeTestData(), "PiJ"));

        System.out.println("getStudentsParallel: " + getStudentsParallel(makeTestData()));

        final boolean PARALLEL_FOR_LARGE = true;
        runLarge(PARALLEL_FOR_LARGE);
    }
}
