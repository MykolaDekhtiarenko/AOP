package com.mdekhtiarenko.persistence.implementation;

import com.mdekhtiarenko.persistence.entity.Student;
import com.mdekhtiarenko.persistence.interfaces.StudentDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager em;

    public Student add(Student student) {
        em.persist(student);
        return student;
    }

    @Cacheable(cacheName = "studentsCache")
    public Student getStudentById(int id){
        return jdbcTemplate.queryForObject(SQL_SELECT_STUDENT_BY_ID,
                new ParameterizedRowMapper<Student>() {
                    public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
                        Student student = new Student();
                        student.setStudentId(rs.getInt(1));
                        student.setPib(rs.getString(2));
                        student.setCourse(rs.getInt(3));
                        return student;
                    }
                },id);
    }
    public Student get(int id) {
        return em.find(Student.class, id);
    }
}
