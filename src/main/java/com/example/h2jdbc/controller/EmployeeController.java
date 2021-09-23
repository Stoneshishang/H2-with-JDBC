package com.example.h2jdbc.controller;

import com.example.h2jdbc.model.Employee;
import com.example.h2jdbc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @PostMapping("/")
    public String addEmployee(@RequestBody Employee emp){
        return employeeService.addEmploy(emp);
    }

    @PutMapping("/")
    public String updateEmployee(@RequestBody Employee emp){
        return employeeService.updateEmployee(emp);
    }
}
