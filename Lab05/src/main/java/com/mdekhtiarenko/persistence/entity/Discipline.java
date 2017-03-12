package com.mdekhtiarenko.persistence.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
@Entity
@Table(name="Disciplines")
public class Discipline {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int Id;
    private String name;
    private double credits;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="owner")
    private Teacher owner;

    @ManyToMany(mappedBy = "disciplines")
    List<Student> students;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public Teacher getOwner() {
        return owner;
    }

    public void setOwner(Teacher owner) {
        this.owner = owner;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
