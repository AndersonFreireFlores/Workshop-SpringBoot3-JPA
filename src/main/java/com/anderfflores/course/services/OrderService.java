package com.anderfflores.course.services;

import com.anderfflores.course.entities.Order;
import com.anderfflores.course.repositories.OrderRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepositories repository;
    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById (Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
