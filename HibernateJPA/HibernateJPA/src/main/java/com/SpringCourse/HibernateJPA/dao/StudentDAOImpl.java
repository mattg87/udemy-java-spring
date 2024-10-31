package com.SpringCourse.HibernateJPA.dao;

import com.SpringCourse.HibernateJPA.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO
{
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager anEntityManager) {
        this.entityManager = anEntityManager;
    }

    @Override
    @Transactional
    public void save(Student aStudent) {
        entityManager.persist(aStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findByFirstName(String firstName) {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE firstName=:theData", Student.class);
        theQuery.setParameter("theData", firstName);

        return theQuery.getResultList();
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by email", Student.class);

        return theQuery.getResultList();
    }
}
