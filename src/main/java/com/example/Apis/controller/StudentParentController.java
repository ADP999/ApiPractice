package com.example.Apis.controller;


import com.example.Apis.entity.Student;
import com.example.Apis.entity.StudentParent;
import com.example.Apis.service.StudentParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/studentParentDetails")
public class StudentParentController {



        @Autowired
        private StudentParentService studentParentService;

        @GetMapping("/getStudentParent")
        public List<StudentParent> getAllStudentParent(){
            return studentParentService.getAllStudentParent();
        }
}
