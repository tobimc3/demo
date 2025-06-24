package com.mcfarland.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.beans.factory.annotation.Autowired;
import com.mcfarland.demo.service.UserService;
import com.mcfarland.demo.entity.User;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/users")

public class UserController {

    @Autowired

    private UserService userService;

    @GetMapping

    public List<User> getAllUsers() {

        return userService.getAllUsers();

    }

    @PostMapping

    public User createUser(@RequestBody User user) {

        return userService.createUser(user);

    }

    // Add more endpoints as necessary


    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }


}
