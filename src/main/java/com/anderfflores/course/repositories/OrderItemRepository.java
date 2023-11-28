package com.anderfflores.course.repositories;

import com.anderfflores.course.entities.OrderItem;
import com.anderfflores.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {}
