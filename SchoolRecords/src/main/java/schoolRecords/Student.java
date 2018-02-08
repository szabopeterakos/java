package schoolRecords;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        if (name.length() == 0) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    // "Kovács marks: matematika: excellent(5)"
    public String toString() {

        return this.name + " marks: " + marks.get(0).getSubject() + ": " + marks.get(0);
    }

    public void grading(Mark actualMark) {
        if (actualMark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(actualMark);
    }

    public double calculateAverage() {
        double sum = 0;
        double avg = 0.0;
        for (Mark c : marks) {
            sum += c.getMarkType().value;
        }
        if (sum == 0.0 || marks.size() == 0) {
            return 0.0;
        }

        avg = sum / marks.size();

        avg = new BigDecimal(avg).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return avg;
    }

    public double calculateSubjectAverage(Subject s) {
        double sum = 0;
        double avg;
        int marksWithCurrentSubject = 0;
        for (Mark c : marks) {
            if (c.getSubject().getSubjectName().equals(s.getSubjectName())) {
                sum += c.getMarkType().value;
                marksWithCurrentSubject++;
            }
        }
        if (sum == 0.0) {
            return 0.0;
        }

        avg = sum / marksWithCurrentSubject;

        avg = new BigDecimal(avg).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return avg;
    }

}
