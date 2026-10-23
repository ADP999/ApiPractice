package com.example.Apis.service;


import com.example.Apis.entity.StudentParent;
import java.util.List;


public interface StudentParentService {


    List<StudentParent> getAllStudentParent();

	String saveStudentDetails(StudentParent studentParent);
}
