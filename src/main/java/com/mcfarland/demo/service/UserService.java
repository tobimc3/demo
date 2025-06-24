package com.mcfarland.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcfarland.demo.dao.UserRepository;
import com.mcfarland.demo.entity.User;
import java.util.List;


@Service

public class UserService {

    @Autowired

    private UserRepository userRepository;

    public List<User> getAllUsers() {

        return userRepository.findAll();

    }

    public User createUser(User user) {

        return userRepository.save(user);

    }

    // Include additional service methods as required

    public void deleteUserById(Long id) {
      userRepository.deleteById(id);
    }   

}

