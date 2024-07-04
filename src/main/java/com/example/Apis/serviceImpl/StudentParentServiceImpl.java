package com.example.Apis.serviceImpl;

import com.example.Apis.entity.StudentParent;
import com.example.Apis.repository.StudentParentRepository;
import com.example.Apis.service.StudentParentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentParentServiceImpl implements StudentParentService {

    @Autowired
    StudentParentRepository studentParentRepository;

    @Override
    public List<StudentParent> getAllStudentParent() {
        return studentParentRepository.findAll();
    }
}
