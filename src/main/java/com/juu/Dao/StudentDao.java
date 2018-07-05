package com.juu.Dao;

import com.juu.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students = new HashMap<>();

    static {
        students.put(1, new Student(1, "Booob", "wf"));
        students.put(2, new Student(2, "Mike", "polish"));
        students.put(3, new Student(3, "Kate", "math"));
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }
}
