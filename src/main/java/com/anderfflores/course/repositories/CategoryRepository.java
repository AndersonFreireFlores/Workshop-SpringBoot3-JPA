package com.anderfflores.course.repositories;

import com.anderfflores.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {}
