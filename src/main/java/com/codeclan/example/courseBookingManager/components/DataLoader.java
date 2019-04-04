package com.codeclan.example.courseBookingManager.components;

import com.codeclan.example.courseBookingManager.models.Booking;
import com.codeclan.example.courseBookingManager.models.Course;
import com.codeclan.example.courseBookingManager.models.Customer;
import com.codeclan.example.courseBookingManager.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.courseBookingManager.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.courseBookingManager.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Course spanish = new Course("Spanish", "Glasgow", 4);
        courseRepository.save(spanish);

        Course french = new Course("French", "Edinburgh", 4);
        courseRepository.save(french);

        Course mandarin = new Course("Mandarin", "Edinburgh", 3);
        courseRepository.save(mandarin);

        Course japanese = new Course("Japanese", "Glasgow", 5);
        courseRepository.save(japanese);

        Customer eloise = new Customer("Eloise Coveny", "Glasgow", 32);
        customerRepository.save(eloise);

        Customer holly = new Customer("Holly Ward", "Edinburgh", 32);
        customerRepository.save(holly);

        Customer bobby = new Customer("Bobby Brown", "Glasgow", 45);
        customerRepository.save(bobby);

        Booking booking1 = new Booking("04-04-2019", mandarin, holly);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("01-04-2019", japanese, eloise);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("25-03-2019", japanese, bobby);
        bookingRepository.save(booking3);
    }
}
