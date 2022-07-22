package com.collicode.schoolDemo.repository;

import com.collicode.schoolDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
//extends
public interface StudentRepository extends JpaRepository<Student,Long> {
}
