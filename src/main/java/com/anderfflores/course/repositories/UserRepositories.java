package com.anderfflores.course.repositories;

import com.anderfflores.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User,Long> {}
