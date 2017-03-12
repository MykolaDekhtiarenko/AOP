package com.mdekhtiarenko.persistence.entity;

import javax.persistence.*;

/**
 * Created by mykola.dekhtiarenko on 10.03.17.
 */
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int id;
    private String login;
    private String password;
    private String mail;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
