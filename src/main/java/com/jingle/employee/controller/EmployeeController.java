package com.jingle.employee.controller;

import com.jingle.employee.entity.Employee;
import com.jingle.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "/employee/save")
    public ResponseEntity save(@RequestBody Employee employee) {
        employeeService.save(employee);

        ResponseEntity res = new ResponseEntity("SAVE IS OK",null,HttpStatus.CREATED);
        return res;
    }
    @GetMapping(value = "/employee/{id}")
    public ResponseEntity save(@PathVariable int id) {

        Employee employee = employeeService.findById(id);

        ResponseEntity res = new ResponseEntity(employee,null,HttpStatus.OK);
        return res;
    }
}
