package com.example.Apis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stud")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String Name;
    @Column(name = "email", nullable = false)
    private String Email;
    @Column(name = "address",nullable = false)
    private String Address;
    @Column(name = "blood_group", nullable = false)
    private String BloodGroup;

}
