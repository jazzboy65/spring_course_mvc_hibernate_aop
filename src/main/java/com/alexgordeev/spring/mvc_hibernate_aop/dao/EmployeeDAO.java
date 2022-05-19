package com.alexgordeev.spring.mvc_hibernate_aop.dao;

import com.alexgordeev.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}
