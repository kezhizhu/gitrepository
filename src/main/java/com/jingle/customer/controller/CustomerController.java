package com.jingle.customer.controller;

import com.jingle.customer.entity.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping(value = "/customer/{id}")
    public Customer getCustomer(@PathVariable int id){
        Customer customer = null;
        customer = new Customer("xiaodong","wu");
        return customer;
    }
}
