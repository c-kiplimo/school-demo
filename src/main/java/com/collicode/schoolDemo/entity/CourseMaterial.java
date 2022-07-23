package com.collicode.schoolDemo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tbl_course_material")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "course")
public class CourseMaterial {
    @Id
    @SequenceGenerator(name = "course_material_sequence",
            sequenceName = "course_material_sequence",
            allocationSize =  1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            ,generator = "course_material_sequence")
    private Long CourseMaterialId;
    private String url;
    @OneToOne(cascade=CascadeType.ALL,
            optional=false,fetch = FetchType.LAZY)
    @JoinColumn(
            name ="course_id",
            referencedColumnName = "courseId"

    )
    private Course course;

}
