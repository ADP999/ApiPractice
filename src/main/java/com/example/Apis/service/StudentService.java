package com.example.Apis.service;

import com.example.Apis.entity.Student;
import java.util.List;


public interface StudentService {


    List<Student> getAllStudent();
    String saveStudent(Student student);
	Student getSingleId(Integer id);
	
}
