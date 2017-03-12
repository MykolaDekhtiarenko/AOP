package com.mdekhtiarenko.persistence.util;

import com.mdekhtiarenko.persistence.entity.Student;
import com.mdekhtiarenko.persistence.entity.Student_Discipline;
import com.mdekhtiarenko.persistence.interfaces.Student_DisciplineDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
public class Student_DisciplineWorker {
    @Autowired
    Student_DisciplineDao student_disciplineDao;

    public Student_Discipline add(Student_Discipline student_discipline){
        student_discipline = student_disciplineDao.add(student_discipline);
        System.out.println(student_discipline);
        return student_discipline;
    }

    public Student_Discipline get(int id){
        return student_disciplineDao.get(id);
    }
}
