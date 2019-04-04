package com.codeclan.example.courseBookingManager.repositories.CourseRepository;

import com.codeclan.example.courseBookingManager.models.Course;
import com.codeclan.example.courseBookingManager.projections.EmbedForCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedForCourse.class)
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

        List<Course> findCoursesByStarRating(int starRating);

}
