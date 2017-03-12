package com.mdekhtiarenko.persistence.interfaces;

import com.mdekhtiarenko.persistence.entity.Student_Discipline;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
public interface Student_DisciplineDao {
    Student_Discipline add(Student_Discipline student_discipline);
    Student_Discipline get(int id);
}
