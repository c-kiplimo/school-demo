package com.collicode.schoolDemo.repository;

import com.collicode.schoolDemo.entity.Course;
import com.collicode.schoolDemo.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//
@SpringBootTest
class CourseMaterialRepositoryTest {
@Autowired
    private CourseMaterialRepository courseRepository;
@Test
public  void saveCourseMaterial(){
    Course course=Course.builder().title("Data Structures and algorithims").credit(30).build();
    CourseMaterial courseMaterial=CourseMaterial.builder().url("www.collicode.com").build();
    courseRepository.save(courseMaterial);

}
@Test
public  void printAllCoursesMaterial(){
    List<CourseMaterial>courseMaterials=courseRepository.findAll();
    System.out.println("course materials = "+courseMaterials);

}

}