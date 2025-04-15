package com.mcfarland.demo.dao;

import com.mcfarland.demo.entity.Employee;
import java.util.List;


public interface EmployeeDao {
    /*List<Employee> findAll();*/
    void insertEmployee(Employee emp);
    void updateEmployee(Employee emp);
    void executeUpdateEmployee(Employee emp);
    void deleteEmployee(Employee emp);
    }