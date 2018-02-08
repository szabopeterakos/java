package schoolRecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Tutor {

    String name;
    List<Subject> taughtSubject = new ArrayList<Subject>();

    public String getName() {
        return name;
    }

    public Tutor(String name, List<Subject> taughtSubject) {
        this.name = name;
        this.taughtSubject = taughtSubject;
    }

    public boolean tutorTeachingSubject(Subject s) {
        if (taughtSubject.contains(s)) {
            return true;
        }
        return false;
    }
}
