package com.codeclan.example.courseBookingManager.projections;

import com.codeclan.example.courseBookingManager.models.Booking;
import com.codeclan.example.courseBookingManager.models.Course;
import com.codeclan.example.courseBookingManager.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedForBooking", types = Booking.class)
public interface EmbedForBooking {
    Long getId();
    String getDate();
    Course getCourse();
    Customer getCustomer();
}
