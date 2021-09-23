package com.example.h2jdbc.repository;

import com.example.h2jdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Value("${app.sql.GET_ALL}")
    private String GET_ALL;

    @Value("${app.sql.INSERT_EMPLOYEE}")
    private String INSERT_EMPLOYEE;

    @Value("${app.sql.UPDATE_EMPLOYEE}")
    private String UPDATE_EMPLOYEE;

    @Value("${app.sql.DELETE_EMPLOYEE}")
    private String DELETE_EMPLOYEE;

    private RowMapper<Employee> rowMapper=(ResultSet rs, int rowNum ) ->{
        Employee emp = new Employee();

        emp.setId(rs.getInt(1));
        emp.setFirstName(rs.getString(2));
        emp.setLastName(rs.getString(3));
        emp.setAddress(rs.getString(4));
        emp.setJoiningDate(rs.getString(5));

        return emp;

    };

    public List<Employee> findAll() {

        return jdbcTemplate.query(GET_ALL, rowMapper);
    }

    public boolean addEmployee(Employee e){
        return jdbcTemplate.update(INSERT_EMPLOYEE, e.getFirstName(), e.getLastName(), e.getAddress()) > 0;
    }

    public boolean updateEmployee(Employee e) {
        return jdbcTemplate.update(UPDATE_EMPLOYEE, e.getFirstName(), e.getLastName(), e.getAddress(), e.getId()) > 0;
    }

    public boolean deleteEmployee(int id) {
        return jdbcTemplate.update(DELETE_EMPLOYEE, id) > 0;
    }
}
