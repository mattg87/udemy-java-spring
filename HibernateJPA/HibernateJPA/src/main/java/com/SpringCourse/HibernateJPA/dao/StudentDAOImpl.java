package com.SpringCourse.HibernateJPA.dao;

import com.SpringCourse.HibernateJPA.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
}
