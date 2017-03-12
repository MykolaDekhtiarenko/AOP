package com.mdekhtiarenko.persistence.util;

import com.mdekhtiarenko.persistence.entity.Discipline;
import com.mdekhtiarenko.persistence.entity.Teacher;
import com.mdekhtiarenko.persistence.interfaces.DisciplineDao;
import com.mdekhtiarenko.persistence.interfaces.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
public class DisciplineWorker {
    @Autowired
    DisciplineDao disciplineDao;

    public Discipline add(Discipline discipline){
        discipline = disciplineDao.add(discipline);
        System.out.println(discipline);
        return discipline;
    }

    public Discipline get(int id){
        return disciplineDao.get(id);
    }
}
