package com.anderfflores.course.resources;

import com.anderfflores.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll (){
        User u = new User(1L,"Ande","ande@gmail.com","12345","54321");
        return ResponseEntity.ok().body(u);
    }

}
