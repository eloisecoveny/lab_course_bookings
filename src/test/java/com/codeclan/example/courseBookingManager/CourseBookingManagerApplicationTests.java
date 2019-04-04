package com.codeclan.example.courseBookingManager;

import com.codeclan.example.courseBookingManager.models.Booking;
import com.codeclan.example.courseBookingManager.models.Course;
import com.codeclan.example.courseBookingManager.models.Customer;
import com.codeclan.example.courseBookingManager.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.courseBookingManager.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.courseBookingManager.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingManagerApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetAllCoursesWithAGivenRating(){
		List<Course> found = courseRepository.findCoursesByStarRating(5);
		assertEquals(1, found.size());
	}

	@Test
	public void canGetAllCustomersForAGivenCourse(){
		List<Customer> found = customerRepository.findCustomersByCourseId(4L);
		assertEquals(2, found.size());
	}

	@Test
	public void canGetAllCoursesBookedByCustomer(){
		List<Course> found = courseRepository.findCoursesByCustomerId(1L);
		assertEquals(1, found.size());
	}

	@Test
	public void canGetBookingsForASpecificDate(){
		List<Booking> found = bookingRepository.findBookingsByDate("04-04-2019");
		assertEquals(1, found.size());
	}

	@Test
	public void canGetAllCustomersInAGivenTownForAGivenCourse(){
		List<Customer> found = customerRepository.findCustomersByTownAndCourseId("Glasgow", 4L);
		assertEquals(2, found.size());
	}

	@Test
	public void canGetAllCustomersOverACertainAgeInAGivenTownForAGivenCourse(){
		List<Customer> found = customerRepository.findCustomersOverAgeByTownAndCourseId(40, "Glasgow", 4L);
		assertEquals(1, found.size());
	}

}
