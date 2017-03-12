package com.mdekhtiarenko.persistence.implementation;

import com.mdekhtiarenko.persistence.entity.Teacher;
import com.mdekhtiarenko.persistence.interfaces.TeacherDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
@Repository
@Transactional
public class TeacherDaoJPAImpl implements TeacherDao {

    @PersistenceContext
    private EntityManager em;

    public Teacher add(Teacher teacher) {
        em.persist(teacher);
        return teacher;
    }

    public Teacher get(int id) {
        return em.find(Teacher.class, id);
    }
}
