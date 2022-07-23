package com.collicode.schoolDemo.repositoryTests;

import com.collicode.schoolDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

interface StudentRepository extends JpaRepository<Student,Long> {
  List<Student>findByFirstname(String firstname);
  List<Student>findByFirstnameContaining(String name);
  List<Student>findByGuardianName(String guardianName);
  @Query("select s from Student s where emailId=?1")
  Student getStudentByEmailAddress(String emailId);
  @Query("select s.firstname from Student s where emailId=?1")
  String getFirstNameByEmailAddress(String emailId);
  @Query(
          value = "select *from tbl_student s where s.email_address=?1",
          nativeQuery = true
  )
  Student getStudentFirstNameByEmailAddress(String emailId);

  @Transactional
  @Modifying
  @Query(
          value = "update tbl_student set first_name = ?1 where email_address = ?2",
          nativeQuery = true
  )
  int updateStudentfirstNameByEmailId(String firstname,String emailId);
}

