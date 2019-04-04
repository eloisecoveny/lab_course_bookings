package com.codeclan.example.courseBookingManager.repositories.CustomerRepository;

import com.codeclan.example.courseBookingManager.models.Customer;
import com.codeclan.example.courseBookingManager.projections.EmbedForCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.support.ExcerptProjector;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedForCustomer.class)
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

}
