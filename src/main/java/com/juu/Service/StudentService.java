package com.juu.Service;

import com.juu.Entity.Student;
import java.util.Collection;
import com.juu.Dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }
}
