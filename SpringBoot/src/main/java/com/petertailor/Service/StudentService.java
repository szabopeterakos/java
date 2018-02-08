package com.petertailor.Service;

import com.petertailor.DAO.StudentDAO;
import com.petertailor.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("fakeData")
    private StudentDAO studentDAO01;

    public Collection<Student> getAllStudents() {
        return this.studentDAO01.getAllStudents();
    }

    public Student getStudentById(int id) {
        return this.studentDAO01.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDAO01.removeStudentById(id);
    }

    public void updateStudent(Student student) {
        this.studentDAO01.updateStudent(student);
    }

    public void addStudent(Student student) {
        this.studentDAO01.addStudent(student);
    }
}
