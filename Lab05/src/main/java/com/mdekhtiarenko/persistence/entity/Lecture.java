package com.mdekhtiarenko.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "Lectures")
public class Lecture {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int id;
    private String name;
    private double credits;

    @OneToOne
    @JoinColumn(name = "user")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}