package com.example.h2jdbc.repository;

import com.example.h2jdbc.model.JoinedResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public class JoinedTableRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Value("${app.sql.JOIN_TABLES}")
    private String JOIN_TABLES;

    private RowMapper<JoinedResult> rowMapper=(ResultSet rs, int rowNum ) ->{
        JoinedResult sh = new JoinedResult();

        sh.setId(rs.getInt(1));
        sh.setFirstName(rs.getString(2));
        sh.setSuperPower(rs.getString(3));
        sh.setAddress(rs.getString(4));

        return sh;
    };

    public List<JoinedResult> joinTables(){
        return jdbcTemplate.query(JOIN_TABLES, rowMapper);
    }



}
