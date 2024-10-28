package com.SpringCourse.HibernateJPA.dao;

import com.SpringCourse.HibernateJPA.entity.Student;

import java.util.List;

public interface StudentDAO
{
    void save(Student aStudent);

    Student findById(Integer id);

    List <Student> findAll();
}
