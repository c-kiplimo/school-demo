package com.collicode.schoolDemo.repository;

import com.collicode.schoolDemo.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TeacherRepositoryTest {
    @Autowired

 private TeacherRepository teacherRepository;
    //
    @Test
    public void saveTeacher(){
        Course courseDBMS=Course.builder().title("DBMS").credit(6).build();
        Course courseJAVA=Course.builder().title("JAVA").credit(5).build();


    }
}