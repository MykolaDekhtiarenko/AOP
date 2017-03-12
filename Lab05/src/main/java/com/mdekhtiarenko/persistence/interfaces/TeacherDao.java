package com.mdekhtiarenko.persistence.interfaces;

import com.mdekhtiarenko.persistence.entity.Teacher;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
public interface TeacherDao {
    Teacher add(Teacher teacher);
    Teacher get(int id);
}
