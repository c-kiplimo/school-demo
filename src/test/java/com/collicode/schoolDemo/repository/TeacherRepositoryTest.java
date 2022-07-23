package com.collicode.schoolDemo.repository;

import com.collicode.schoolDemo.entity.Course;
import com.collicode.schoolDemo.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TeacherRepositoryTest {
    @Autowired

 private TeacherRepository teacherRepository;
    @Test
    public void saveTeacher(){
        Course courseDBMS=Course.builder().title("DBMS").credit(6).build();
        Course courseJAVA=Course.builder().title("JAVA").credit(5).build();


    }
}