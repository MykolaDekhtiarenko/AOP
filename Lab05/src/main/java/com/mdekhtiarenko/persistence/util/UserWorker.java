package com.mdekhtiarenko.persistence.util;

import com.mdekhtiarenko.persistence.entity.Lecture;
import com.mdekhtiarenko.persistence.entity.User;
import com.mdekhtiarenko.persistence.interfaces.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.soap.SOAPBinding;

/**
 * Created by mykola.dekhtiarenko on 10.03.17.
 */
public class UserWorker {
    @Autowired
    UserDao userDao;

    public User addUser(User user){
        user = userDao.addUser(user);
        System.out.println(user);
        return user;
    }

    public User get(int id){
        return userDao.getUser(id);
    }
}
