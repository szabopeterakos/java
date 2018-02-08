package com.petertailor.DAO;

import com.petertailor.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;


@Repository
@Qualifier("mongo")
public class MongoStudentDaoImplementaton implements StudentDAO {


    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>() {
            {
                add(new Student(12, "MegaMan", "Trainer"));
            }
        };

    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void addStudent(Student student) {

    }
}
