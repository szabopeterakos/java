package schoolRecords;

public class StudyResultByName {

    String studentName;
    double StudyAverage;

    public StudyResultByName(double studyAverage, String studentName) {
        this.studentName = studentName;
        StudyAverage = studyAverage;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return StudyAverage;
    }
}
