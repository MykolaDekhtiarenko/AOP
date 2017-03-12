package com.mdekhtiarenko.persistence.implementation;

import com.mdekhtiarenko.persistence.entity.Discipline;
import com.mdekhtiarenko.persistence.interfaces.DisciplineDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
@Repository
@Transactional
public class DisciplineDaoJPAImpl implements DisciplineDao {

    @PersistenceContext
    private EntityManager em;

    public Discipline add(Discipline discipline) {
        em.persist(discipline);
        return discipline;
    }

    public Discipline get(int id) {
        return em.find(Discipline.class, id);
    }
}
