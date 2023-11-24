package com.anderfflores.course.services;

import com.anderfflores.course.entities.Category;
import com.anderfflores.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;
    public List<Category> findall(){
        return repository.findAll();
    }

    public Category findById (Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
