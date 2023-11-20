package pij.day15;

import java.util.Objects;

/**
 * Represents the marks a student was awarded in an exam.
 */
public class ExamResult {

    /**
     * Represents the postgraduate degree classification to which given
     * marks correspond.
     */
    public enum Classification {
        FAIL, PASS, MERIT, DISTINCTION;

        public static Classification fromMarks(int marks) {
            if (marks < 50) {
                return FAIL;
            }
            if (marks < 60) {
                return PASS;
            }
            if (marks < 70) {
                return MERIT;
            }
            return DISTINCTION;
        }
    }

    private String studentName;
    private String examName;
    private int marks;

    public ExamResult(String studentName, String examName, int marks) {
        this.studentName = Objects.requireNonNull(studentName);
        this.examName = Objects.requireNonNull(examName);
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Illegal value " + marks
                    + "! Allowed values are at least 0 and at most 100.");
        }
        this.marks = marks;
    }
    public String getStudentName() {
        return this.studentName;
    }
    public String getExamName() {
        return this.examName;
    }
    public int getMarks() {
        return this.marks;
    }
    @Override
    public String toString() {
        return "(" + this.studentName + "," + this.examName + "," + this.marks + ")";
    }
}
