package com.zq.repository.impl;

import com.zq.entity.Student;
import com.zq.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZQ
 * @create 2019-09-06
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "zs", 22));
        studentMap.put(2L, new Student(2L, "ls", 32));
        studentMap.put(3L, new Student(3L, "ww", 42));
        studentMap.put(4L, new Student(4L, "zl", 52));
        studentMap.put(5L, new Student(5L, "lq", 62));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
