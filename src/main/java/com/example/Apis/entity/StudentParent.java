package com.example.Apis.entity;


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
    private String StudentFatherName;
    @Column(name = "student_mother_name", nullable = false)
    private String StudentMotherName;
    @Column(name = "student_siblings", nullable = false)
    private String StudentSiblings;
    @Column(name = "student_address", nullable = false)
    private String StudentAddress;

}
