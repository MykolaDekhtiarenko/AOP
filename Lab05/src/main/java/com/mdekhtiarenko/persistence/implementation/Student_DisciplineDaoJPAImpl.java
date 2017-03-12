package com.mdekhtiarenko.persistence.implementation;

import com.mdekhtiarenko.persistence.entity.Student_Discipline;
import com.mdekhtiarenko.persistence.interfaces.Student_DisciplineDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
@Repository
@Transactional
public class Student_DisciplineDaoJPAImpl implements Student_DisciplineDao {

    @PersistenceContext
    private EntityManager em;

    public Student_Discipline add(Student_Discipline student_discipline) {
        em.persist(student_discipline);
        return student_discipline;
    }

    public Student_Discipline get(int id) {
        return em.find(Student_Discipline.class, id);
    }
}
