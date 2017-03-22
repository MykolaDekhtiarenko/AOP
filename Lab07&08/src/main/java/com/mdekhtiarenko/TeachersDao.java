package com.mdekhtiarenko;

import org.springframework.cache.annotation.Cacheable;

public interface TeachersDao {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTacher(Teacher teacher);
}