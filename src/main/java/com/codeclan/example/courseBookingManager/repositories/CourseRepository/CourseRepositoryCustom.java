package com.codeclan.example.courseBookingManager.repositories.CourseRepository;

import com.codeclan.example.courseBookingManager.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> findCoursesByCustomerId(Long customerId);
}
