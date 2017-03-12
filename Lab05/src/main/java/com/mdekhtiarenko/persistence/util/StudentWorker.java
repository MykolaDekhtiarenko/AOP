package com.mdekhtiarenko.persistence.util;

import com.mdekhtiarenko.persistence.entity.Discipline;
import com.mdekhtiarenko.persistence.entity.Student;
import com.mdekhtiarenko.persistence.interfaces.DisciplineDao;
import com.mdekhtiarenko.persistence.interfaces.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
public class StudentWorker {
    @Autowired
    StudentDao studentDao;

    public Student add(Student student){
        student = studentDao.add(student);
        System.out.println(student);
        return student;
    }

    public Student get(int id){
        return studentDao.get(id);
    }
}
