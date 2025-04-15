package com.mcfarland.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mcfarland.demo.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

    // Define custom query methods if needed

}