package com.jingle.employee.service;

import com.jingle.employee.entity.Employee;
import com.jingle.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
}
