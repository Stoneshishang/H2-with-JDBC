package com.example.h2jdbc.repository;

//import com.example.h2jdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public class EmployeeRepository {

//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    private RowMapper<Employee> rowMapper=(ResultSet rs, int rowNum ) ->{
//        Employee emp = new Employee();
//
//        emp.setId(rs.getInt(1));
//        emp.setFirstName(rs.getString(2));
//        emp.setLastName(rs.getString(3));
//        emp.setAddress(rs.getString(4));
//        emp.setJoiningDate(rs.getString(5));
//
//        return emp;
//
//    };
//
//    public List<Employee> findAll() {
//
//        return jdbcTemplate.query("SELECT * FROM employees", rowMapper);
//    }
}
