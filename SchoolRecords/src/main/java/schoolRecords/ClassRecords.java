package schoolRecords;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public boolean addStudent(Student s) {
        if (s == null) {
            return false;
            //throw new NullPointerException("Student must exist");
        }
        for (Student c : students) {
            if (c.getName().equals(s.getName())) {
                return false;
            }
        }

        this.students.add(s);
        return true;
    }

    public double calculateClassAverage() {
        if (students == null || students.size() == 0) {
            throw new ArithmeticException("No student in the class");
        }

        double sum = 0;
        double avg = 0;

        for (Student c : students) {
            if (c.calculateAverage() == 0) {
                throw new ArithmeticException("No marks present");
            }
            sum += c.calculateAverage();

        }

        avg = new BigDecimal(sum).divide(new BigDecimal(students.size())).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();

        return avg;
    }

    public double calculateClassAverageBySubject(Subject s) {
        double sum = 0;
        double avg = 0;
        int count = 0;

        for (Student c : students) {
            if (c.calculateSubjectAverage(s) != 0) {
                count++;
                sum += c.calculateSubjectAverage(s);
            }

        }

        avg = new BigDecimal(sum).divide(new BigDecimal(count)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();

        return avg;

    }

    public Student findStudentByName(String name) {
        if (name.length() == 0) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }

        Student finded = null;

        for (Student c : students) {
            if (c.getName().equals(name)) {
                return c;
            }
        }

        if (students.size() == 0) {
            throw new IllegalStateException("No students to search!");
        }
        if (finded == null) {
            throw new IllegalArgumentException("Student by this name cannot be found!");
        }

        return finded;
    }

    public String getClassName() {
        return className;
    }

    public Student repetition() {
        if (rnd.nextInt(5) >= students.size()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(rnd.nextInt(5));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> out = new ArrayList<>();

        for (Student c : students) {
            out.add(new StudyResultByName(c.calculateAverage(), c.getName()));
        }

        if (out.size() == 0) {
            throw new IllegalStateException("No students to list results!");
        }

        return out;
    }

    public boolean removeStudent(Student s) {
        for (Student c : students) {
            if (c.getName().equals(s.getName())) {
                students.remove(s);
                return true;
            }
        }
        return false;
    }

    public String listStudentNames() {
        String out = "";
        for (Student c : students) {
            out += c.getName() + ", ";
        }

        out = out.substring(0, out.length() - 2);
        return out;
    }
}
