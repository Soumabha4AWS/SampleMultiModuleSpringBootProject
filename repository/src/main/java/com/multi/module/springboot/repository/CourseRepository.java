package com.multi.module.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.module.springboot.entity.CourseEntity;


public interface CourseRepository extends JpaRepository<CourseEntity,String> {
    CourseEntity findByCourseName(String courseName);
}

