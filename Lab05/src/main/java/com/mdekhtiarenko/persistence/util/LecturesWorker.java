package com.mdekhtiarenko.persistence.util;

import com.mdekhtiarenko.persistence.entity.Lecture;
import com.mdekhtiarenko.persistence.interfaces.LecturesDao;
import org.springframework.beans.factory.annotation.Autowired;

public class LecturesWorker {
    @Autowired
    LecturesDao lecturesDao;

    public Lecture addLecture(Lecture lecture) {
        lecture = lecturesDao.addLecture(lecture);
        System.out.println(lecture);
        return lecture;
    }

    public Lecture get(int id){
        Lecture lecture = lecturesDao.getLecture(id);
        return lecture;
    }

}