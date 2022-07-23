package com.collicode.schoolDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_teacher")
public class Teacher {
    @Id
    @SequenceGenerator(name = "teacher_sequence",
            sequenceName = "teacher_sequence",
            allocationSize =  1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            ,generator = "teacher_sequence")
    private  Long teacherId;
    private String firstName;
    private String lastName;
//    @JoinColumn(name = "teacher_id",referencedColumnName = "teacherId")
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Course> courses;

}
