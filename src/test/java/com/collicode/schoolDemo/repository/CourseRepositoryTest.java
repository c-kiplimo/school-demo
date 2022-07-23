package com.collicode.schoolDemo.repository;

import com.collicode.schoolDemo.entity.Course;
import com.collicode.schoolDemo.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private  CourseRepository courseRepository;
    @Test
    public  void saveCourse(){
        Course course= Course.builder().credit(6).title("OOP").build();
        courseRepository.save(course);
    }
    @Test
    public void  printCourses(){
        List<Course> courses=courseRepository.findAll();
        System.out.println("courses = "+courses);
    }
    //
    @Test
    public void saveCourseWithTeacher(){
        Teacher teacher=Teacher.builder().lastName("kenei").firstName("ken").build();
        Course course=Course.builder().credit(10).teacher(teacher).title("AI").build();
        courseRepository.save(course);
    }
}