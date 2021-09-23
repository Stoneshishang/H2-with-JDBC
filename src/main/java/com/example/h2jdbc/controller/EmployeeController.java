package com.example.h2jdbc.controller;

//import com.example.h2jdbc.model.Employee;
import com.example.h2jdbc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

//    @Autowired
//    EmployeeService employeeService;
//
//    @GetMapping("/")
//    public List<Employee> getAll(){
//        return employeeService.getAll();
//    }
}
