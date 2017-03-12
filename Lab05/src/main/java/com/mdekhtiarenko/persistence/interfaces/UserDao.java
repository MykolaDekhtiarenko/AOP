package com.mdekhtiarenko.persistence.interfaces;

import com.mdekhtiarenko.persistence.entity.Lecture;
import com.mdekhtiarenko.persistence.entity.User;

/**
 * Created by mykola.dekhtiarenko on 10.03.17.
 */
public interface UserDao {
    User addUser(User user);
    User getUser(int id);
    void saveUser(User user);
}

