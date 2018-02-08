package com.petertailor.DAO;

import com.petertailor.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
@Qualifier("fakeData")
public class StudentDAO01 implements StudentDAO {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<>();

        {
            students.put(1, new Student(1, "Anna", "Math"));
            students.put(2, new Student(2, "Bella", "History"));
            students.put(3, new Student(3, "Clementina", "Geography"));
        }
    }

    @Override
    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student) {
        Student sc = students.get(student.getId());
        sc.setCourse(student.getCourse());
        sc.setName(student.getName());
        students.put(student.getId(), student);
    }

    @Override
    public void addStudent(Student student) {
        this.students.put(student.getId(), student);
    }
}
