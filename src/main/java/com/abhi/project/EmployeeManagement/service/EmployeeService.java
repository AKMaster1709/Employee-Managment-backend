package com.abhi.project.EmployeeManagement.service;


import java.util.List;
import com.abhi.project.EmployeeManagement.entity.Employee;


public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}