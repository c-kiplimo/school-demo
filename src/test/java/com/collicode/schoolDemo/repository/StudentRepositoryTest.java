package com.collicode.schoolDemo.repository;

import com.collicode.schoolDemo.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public  void  saveStudent(){
        Student student= Student.builder().emailId("limo@gmail.com").firstname("collins").lastName("limo").guardianName("David").guardianEmail("david@gmail.com").guardianMobile("34567895346774").build();
        studentRepository.save(student);
    }
}