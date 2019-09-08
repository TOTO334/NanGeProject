package com.zq.repository;

import com.zq.entity.Student;

import java.util.Collection;

/**
 * @author ZQ
 * @create 2019-09-06
 */
public interface StudentRepository {
    Collection<Student> findAll();
    Student findById(long id);
    void saveOrUpdate(Student student);
    void deleteById(long id);
}
