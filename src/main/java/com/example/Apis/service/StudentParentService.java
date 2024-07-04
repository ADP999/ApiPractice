package com.example.Apis.service;


import com.example.Apis.entity.StudentParent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentParentService {


    List<StudentParent> getAllStudentParent();
}
