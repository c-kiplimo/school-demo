package com.collicode.schoolDemo.repository;

import com.collicode.schoolDemo.entity.Guardian;
import com.collicode.schoolDemo.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public  void  saveStudent(){
        Student student= Student.builder().emailId("limo@gmail.com").firstname("collins").lastName("limo").build();
        studentRepository.save(student);
    }
    @Test
    public  void  printStudentByFirstName(){
   List<Student> students =studentRepository.findByFirstname("collins");
        System.out.println("students = "+ students);
    }
    @Test
    public void printGetStudentFirstNameByEmailAddress(){
        String firstN=studentRepository.getFirstNameByEmailAddress("kevo@gmail.com");
        System.out.println("firstName = " +firstN);
    }
    @Test
    public  void printgetStudentByEmailAdress(){
        Student student= studentRepository.getStudentByEmailAddress("limo@gmail.com");
        System.out.println("students = "+ student);
    }
    @Test
    public  void  printStudentBasedOnGuardianName(){
        List<Student> students=studentRepository.findByGuardianName("Davide");
        System.out.println("students =" +students);
    }
    @Test
    public  void  printStudentByFirstNameContaing(){
        List<Student> students =studentRepository.findByFirstnameContaining("i");
        System.out.println("students = "+ students);
    }
    @Test
    public void saveStudentWithGuardian(){
        Guardian guardian=Guardian.builder().email("jer@gmail.com").mobile("345678987654").name("jer").build();
      Student student=Student.builder().firstname("Kelvin").lastName("Kiplimo").emailId("kevo@gmail.com").guardian(guardian).build();
      studentRepository.save(student);
      }
//    @Test
//    public  void printAllStudent(){
//        List<Student> studentList =studentRepository.findAll();
//        System.out.println("studentList =" + studentList );
//    }
    @Test
    public  void  updateStudentfirstNameByEmailId(){
        studentRepository.updateStudentfirstNameByEmailId("kiplimo collins","limo@gmail.com");
    }

    @Test
   public void getStudentFirstNameByEmailAddress() {
        Student student= studentRepository.getStudentFirstNameByEmailAddress("kevo@gmail.com");
        System.out.println("student = "+student);
    }
}