package com.codeclan.example.courseBookingManager.projections;

import com.codeclan.example.courseBookingManager.models.Booking;
import com.codeclan.example.courseBookingManager.models.Course;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedForCourse", types = Course.class)
public interface EmbedForCourse {
    Long getId();
    String getName();
    String getTown();
    int getStarRating();
    List<Booking> getBookings();
}
