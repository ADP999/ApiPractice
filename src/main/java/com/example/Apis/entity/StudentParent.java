package com.example.Apis.entity;


import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_details")
public class StudentParent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="student_father_name")
    private String studentFatherName;
    @Column(name = "student_mother_name", nullable = false)
    private String studentMotherName;
    @Column(name = "student_siblings", nullable = false)
    private String studentSiblings;
//    @Column(name = "student_address", nullable = false)
//    private String studentAddress;
    @OneToMany
    @JoinColumn(name="parent_id")
    private List<Student> student;

}
