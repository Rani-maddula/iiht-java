package com.springboot.studentdemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.studentdemo.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
