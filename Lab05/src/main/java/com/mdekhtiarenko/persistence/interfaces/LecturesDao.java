package com.mdekhtiarenko.persistence.interfaces;

import com.mdekhtiarenko.persistence.entity.Lecture;

public interface LecturesDao {

    Lecture addLecture(Lecture lecture);

    Lecture getLecture(int id);

    void saveLecture(Lecture lecture);

}