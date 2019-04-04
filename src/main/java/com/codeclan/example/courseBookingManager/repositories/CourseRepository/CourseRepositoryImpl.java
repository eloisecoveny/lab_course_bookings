package com.codeclan.example.courseBookingManager.repositories.CourseRepository;

import com.codeclan.example.courseBookingManager.models.Course;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseRepositoryImpl {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> findCoursesByCustomerId(Long customerId){
        List<Course> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("bookings", "booking");
            cr.createAlias("booking.customer", "customer");
            cr.add(Restrictions.eq("customer.id", customerId));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            return results;
        }
    }
}
