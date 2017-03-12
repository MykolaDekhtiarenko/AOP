package com.mdekhtiarenko.persistence.implementation;

import com.mdekhtiarenko.persistence.entity.User;
import com.mdekhtiarenko.persistence.interfaces.UserDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by mykola.dekhtiarenko on 10.03.17.
 */
@Repository
@Transactional
public class UserDaoJPAImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    public User addUser(User user) {
        em.persist(user);
        return user;
    }

    public User getUser(int id) {
        return em.find(User.class, id);
    }

    public void saveUser(User user) {
        em.merge(user);
    }
}
