package com.mdekhtiarenko.persistence.interfaces;

import com.mdekhtiarenko.persistence.entity.Student;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
public interface StudentDao {
    Student add(Student student);
    Student get(int id);
}
