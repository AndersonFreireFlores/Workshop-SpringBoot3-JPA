package com.anderfflores.course.services;

import com.anderfflores.course.entities.User;
import com.anderfflores.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    public List<User> findall(){
        return repository.findAll();
    }

    public User findById (Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User insert (User obj){
        return repository.save(obj);
    }
}
