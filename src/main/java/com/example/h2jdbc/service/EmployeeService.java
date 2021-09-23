package com.example.h2jdbc.service;

import com.example.h2jdbc.model.Employee;
import com.example.h2jdbc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public String addEmploy(Employee emp) {
        String response;
        if(employeeRepository.addEmployee(emp)) response = "Successfully Added";
        else response = "Failed to add, Please try again.";
        return response;
    }

    public String updateEmployee(Employee emp) {
        String response;
        if(employeeRepository.updateEmployee(emp)) response = "Successfully Updated";
        else response = "Failed to update, Please try again.";
        return response;
    }
}
