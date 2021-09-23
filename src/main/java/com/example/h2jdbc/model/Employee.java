package com.example.h2jdbc.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//@Entity
//@Table(name = "employees")
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String joiningDate;


}
