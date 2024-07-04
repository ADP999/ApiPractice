package com.example.Apis.serviceImpl;

import com.example.Apis.entity.Student;
import com.example.Apis.repository.StudentRepository;
import com.example.Apis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
