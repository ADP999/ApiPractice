package com.example.Apis.service;

import com.example.Apis.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {


    List<Student> getAllStudent();
}
