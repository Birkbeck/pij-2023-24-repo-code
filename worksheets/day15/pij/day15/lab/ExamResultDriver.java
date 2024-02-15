package pij.day15.lab;

import java.util.List;

import static pij.day15.lab.ExamResultHelper.makeLargeTestData;
import static pij.day15.lab.ExamResultHelper.makeTestData;
import static pij.day15.lab.ExamResultUtils.*;

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
        System.out.println("classificationsToResults: "
                + classificationsToResults(makeTestData(), "PiJ"));
        System.out.println("allClassificationsToResults: "
                + allClassificationsToResults(makeTestData(), "PiJ"));

        System.out.println("getStudentsParallel: " + getStudentsParallel(makeTestData()));

        final boolean PARALLEL_FOR_LARGE = false;
        runLarge(PARALLEL_FOR_LARGE);


    }
}
