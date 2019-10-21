package com.springboot.studentdemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.studentdemo.model.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

}
