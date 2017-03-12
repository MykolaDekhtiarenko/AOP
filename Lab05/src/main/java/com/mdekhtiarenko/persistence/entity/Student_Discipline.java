package com.mdekhtiarenko.persistence.entity;

import javax.persistence.*;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
@Entity
@Table(name = "Student_Discipline")
public class Student_Discipline {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int id;
    private int Student_id;
    private int Discipline_id;

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public int getDiscipline_id() {
        return Discipline_id;
    }

    public void setDiscipline_id(int discipline_id) {
        Discipline_id = discipline_id;
    }
}
