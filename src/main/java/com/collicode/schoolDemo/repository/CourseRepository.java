package com.collicode.schoolDemo.repository;

import com.collicode.schoolDemo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CourseRepository extends JpaRepository<Course,Long> {
}
