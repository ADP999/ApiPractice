package com.example.Apis.service;

import com.example.Apis.entity.StudentParent;
import com.example.Apis.repository.StudentParentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentParentServiceImpl implements StudentParentService {

    @Autowired
    StudentParentRepository studentParentRepository;

    @Override
    public List<StudentParent> getAllStudentParent() {
        return studentParentRepository.findAll();
    }

	@Override
	public String saveStudentDetails(StudentParent studentParent) {
		
		 studentParentRepository.save(studentParent);
		 return "saved";
	}
}
