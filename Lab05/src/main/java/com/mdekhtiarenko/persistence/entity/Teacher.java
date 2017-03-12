package com.mdekhtiarenko.persistence.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
@Entity
@Table(name = "Teachers")
public class Teacher {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int Id;
    private String pib;

    @OneToMany(mappedBy = "owner")
    private List<Discipline> disciplines;

    public Teacher() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }
}
