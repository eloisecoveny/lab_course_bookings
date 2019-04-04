package com.codeclan.example.courseBookingManager.controllers;

import com.codeclan.example.courseBookingManager.models.Customer;
import com.codeclan.example.courseBookingManager.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{courseId}")
    public List<Customer> findCustomersByCourseId(@PathVariable Long courseId){
        return customerRepository.findCustomersByCourseId(courseId);
    }

    @GetMapping(value = "/town/{town}/course/{courseId}/age/{age}")
    public List<Customer> findCustomersOverAgeByTownAndCourseId(@PathVariable String town, @PathVariable Long courseId, @PathVariable int age){
        return customerRepository.findCustomersOverAgeByTownAndCourseId(age, town, courseId);
    }

    @GetMapping(value = "/town/{town}/course/{courseId}")
    public List<Customer> findCustomersByTownAndCourseId(@PathVariable String town, @PathVariable Long courseId){
        return customerRepository.findCustomersByTownAndCourseId(town, courseId);
    }


}
