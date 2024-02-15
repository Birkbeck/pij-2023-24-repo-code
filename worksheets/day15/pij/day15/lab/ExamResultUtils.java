package pij.day15.lab;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        return results.stream()
                .collect(Collectors.groupingBy(ExamResult::getExamName));

    }

    public static Map<ExamResult.Classification, List<ExamResult>>
                classificationsToResults(Collection<? extends ExamResult> results, String exam) {
        return results.stream()
                .filter(r -> r.getExamName().equals(exam))
                .collect(Collectors.groupingBy(r -> ExamResult.Classification.fromMarks(r.getMarks())));
    }

    public static Map<ExamResult.Classification, List<ExamResult>>
                allClassificationsToResults(Collection<? extends ExamResult> results, String exam) {
        return Arrays // we need a Stream<ExamResult.Classification> of all keys for our new map ...
                .stream(ExamResult.Classification.values())
                // ... and now we need to find the values to make a
                // Map<ExamResult.Classification, List<ExamResult>>
                .collect(Collectors
                        .toMap(Function.identity(), // or: c -> c (no change for the keys)
                               // extract the list with the value list for the key
                               // via a separate stream pipeline
                               c -> results
                                     .stream()
                                     .filter(r -> r.getExamName().equals(exam) &&
                                                  c == ExamResult.Classification.fromMarks(r.getMarks()))
                                     // .toList() would lead to type problems due to the wildcard
                                     // in the type Stream<? extends ExamResult>
                                     .collect(Collectors.toList())));
    }
}
