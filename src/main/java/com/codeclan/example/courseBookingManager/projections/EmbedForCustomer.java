package com.codeclan.example.courseBookingManager.projections;

import com.codeclan.example.courseBookingManager.models.Booking;
import com.codeclan.example.courseBookingManager.models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedForCustomer", types = Customer.class)
public interface EmbedForCustomer {
    Long getId();
    String getName();
    String getTown();
    int getAge();
    List<Booking> getBookings();
}
