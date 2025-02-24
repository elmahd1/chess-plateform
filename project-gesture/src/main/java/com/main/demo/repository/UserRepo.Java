package com.main.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.main.demo.models.User;
public interface UserRepo extends JpaRepository<User, Long> {
    
}
