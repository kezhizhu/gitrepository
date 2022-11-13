package com.example.service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public Employee save(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }
    public Employee findById(int id) {
        return employeeRepository.findById(id);
    }
}
