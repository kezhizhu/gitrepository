package com.jingle.employee.service;

import com.jingle.employee.entity.Employee;
import com.jingle.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    @Transactional
    public Employee save(Employee employee) {

        Employee emp = employeeRepository.save(employee);

        return employee;
    }
    @Transactional
    public Employee findById(int id) {

        return employeeRepository.findById(id);

    }
    @Transactional
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
}
