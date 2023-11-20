package pij.day15.lab;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ExamResultUtils {
    public static List<String> getStudents(Collection<? extends ExamResult> results) {
        return results.stream()
                .map(ExamResult::getStudentName)
                .distinct()
                //.sorted((x,y) -> x.length() - y.length())
                //.sorted(Comparator.reverseOrder())
                .sorted()
                .toList();
    }

    public static List<String> getStudentsParallel(Collection<? extends ExamResult> results) {
        return results.parallelStream()
                .map(ExamResult::getStudentName)
                .distinct()
                //.sorted((x,y) -> x.length() - y.length())
                //.sorted(Comparator.reverseOrder())
                .sorted()
                .toList();
    }

    public static List<String>
            getStudentsOnExam(Collection<? extends ExamResult> results, String exam) {

        return results.stream()
                .filter(r -> r.getExamName().equals(exam))
                .map(ExamResult::getStudentName)
                .distinct()
                .sorted()
                .toList();
    }

    public static Map<String, List<ExamResult>> groupByExams(Collection<? extends ExamResult> results) {
        return null; // TODO
    }

    public static Map<ExamResult.Classification, List<ExamResult>>
                classificationsToResults(Collection<? extends ExamResult> results, String exam) {
        return null; // TODO
    }
}
