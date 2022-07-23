package com.collicode.schoolDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_course")
public class Course {
    @Id
    @SequenceGenerator(name = "course_sequence",
    sequenceName = "course_sequence",
    allocationSize =  1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE
    ,generator = "course_sequence")
    private  Long CourseId;
    private  String title;
    private Integer credit;
    @OneToOne(
            mappedBy = "course"
    )
    private CourseMaterial courseMaterial;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "teacher_id"
    ,referencedColumnName = "teacherId")

    private  Teacher teacher;
}
