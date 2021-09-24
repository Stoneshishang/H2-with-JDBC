package com.example.h2jdbc.service;

import com.example.h2jdbc.model.Employee;
import com.example.h2jdbc.model.JoinedResult;
import com.example.h2jdbc.repository.EmployeeRepository;
import com.example.h2jdbc.repository.JoinedTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    JoinedTableRepository joinedTableRepository;

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public List<JoinedResult> jionAll() {
        return joinedTableRepository.joinTables();
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

    public String deleteEmployee(int id) {
        String response;
        if(employeeRepository.deleteEmployee(id)) response = "Successfully Deleted";
        else response = "Failed to delete, Please try again.";
        return response;
    }
}
