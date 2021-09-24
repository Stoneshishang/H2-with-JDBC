DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
    id int not null primary key auto_increment,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    address varchar(255) not null,
    joining_date timestamp default(CURRENT_TIME)
);

CREATE TABLE super_heroes (
    id int not null primary key auto_increment,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    super_power varchar(255) not null,
    movies varchar(255) not null
)
AS SELECT * FROM CSVREAD('classpath:SuperHeroes.csv');