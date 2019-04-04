package com.codeclan.example.courseBookingManager.controllers;

import com.codeclan.example.courseBookingManager.models.Course;
import com.codeclan.example.courseBookingManager.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/customer/{customerId}")
    public List<Course> findCoursesByCustomerId(@PathVariable Long customerId){
        return courseRepository.findCoursesByCustomerId(customerId);
    }
}
