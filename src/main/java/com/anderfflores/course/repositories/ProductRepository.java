package com.anderfflores.course.repositories;

import com.anderfflores.course.entities.Category;
import com.anderfflores.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {}
