package com.mdekhtiarenko.persistence.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int id;
    private String pib;
    private int course;

    @ManyToMany
    @JoinTable(name = "Student_Discipline",
    joinColumns = @JoinColumn(name="Student_id"),
    inverseJoinColumns = @JoinColumn(name = "discipline_id"))
    List<Discipline> disciplines;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }
}
