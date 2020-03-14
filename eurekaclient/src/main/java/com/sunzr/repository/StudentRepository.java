package com.sunzr.repository;

import com.sunzr.entity.Student;

import java.util.Collection;

public interface StudentRepository
{
    public Collection<Student> finaAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
