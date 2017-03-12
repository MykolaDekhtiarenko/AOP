package com.mdekhtiarenko.test;

import com.mdekhtiarenko.persistence.entity.Student;
import com.mdekhtiarenko.persistence.entity.Student_Discipline;
import com.mdekhtiarenko.persistence.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        TeacherWorker teacherWorker = (TeacherWorker) context.getBean("TeacherWorker");
        DisciplineWorker disciplineWorker = (DisciplineWorker) context.getBean("DisciplineWorker");
        UserWorker userWorker = (UserWorker) context.getBean("UserWorker");
        LecturesWorker lecturesWorker = (LecturesWorker) context.getBean("LectureWorker");
        Student_DisciplineWorker student_disciplineWorker = (Student_DisciplineWorker)context.getBean("Student_DisciplineWorker");
        StudentWorker studentWorker = (StudentWorker) context.getBean("StudentWorker");

        // /        Teacher t = new Teacher();
//        t.setPib("Глибовець Aндрій Миколайович");
//        teacherWorker.add(t);

//        Discipline d1 = new Discipline();
//        d1.setName("PL");
//        d1.setCredits(4);
//        d1.setOwner(t);

//        Discipline d2 = new Discipline();
//        d2.setName("Algorithms");
//        d2.setCredits(3.5);
//        d2.setOwner(teacherWorker.get(1));

//        disciplineWorker.add(d1);
//        disciplineWorker.add(d2);

//        User u = new User();
//        u.setLogin("login");
//        u.setPassword("password");
//
//        userWorker.addUser(u);
//
//        Lecture l = new Lecture();
//        l.setName("Tesst name");
//        l.setCredits(3);
//        l.setUser(u);
//
//        lecturesWorker.addLecture(l);
//        Student s = new Student();
//        s.setPib("Test Student");
//        s.setCourse(1);
//
//        studentWorker.add(s);



    }
}