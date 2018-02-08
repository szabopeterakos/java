package schoolRecords;

public class Subject {

    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subject subject = (Subject) o;

        return subjectName.equals(subject.subjectName);
    }

    @Override
    public int hashCode() {
        return subjectName.hashCode();
    }

    @Override
    public String toString() {
        return subjectName;
    }
}
