package com.anderfflores.course.repositories;

import com.anderfflores.course.entities.Order;
import com.anderfflores.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositories extends JpaRepository<Order,Long> {}
