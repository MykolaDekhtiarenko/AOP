package com.mdekhtiarenko.persistence.util;

import com.mdekhtiarenko.persistence.entity.Teacher;
import com.mdekhtiarenko.persistence.interfaces.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
public class TeacherWorker {
    @Autowired
    TeacherDao teacherDao;

    public Teacher add(Teacher teacher){
        teacher = teacherDao.add(teacher);
        System.out.println(teacher);
        return teacher;
    }

    public Teacher get(int id){
        return teacherDao.get(id);
    }
}
