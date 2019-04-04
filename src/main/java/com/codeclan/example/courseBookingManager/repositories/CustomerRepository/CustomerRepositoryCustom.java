package com.codeclan.example.courseBookingManager.repositories.CustomerRepository;

import com.codeclan.example.courseBookingManager.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findCustomersByCourseId(Long courseId);

    List<Customer> findCustomersByTownAndCourseId(String town, Long courseId);

    List<Customer> findCustomersOverAgeByTownAndCourseId(int age, String town, Long courseId);
}
