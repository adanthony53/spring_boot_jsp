package com.example.repository;

import com.example.entity.Student;

import java.util.Collection;
import java.util.List;

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
