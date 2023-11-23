package com.anderfflores.course.services;

import com.anderfflores.course.entities.User;
import com.anderfflores.course.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepositories repository;
    public List<User> findall(){
        return repository.findAll();
    }

    public User findById (Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
