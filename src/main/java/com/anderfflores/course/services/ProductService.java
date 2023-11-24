package com.anderfflores.course.services;

import com.anderfflores.course.entities.Product;
import com.anderfflores.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;
    public List<Product> findall(){
        return repository.findAll();
    }

    public Product findById (Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
