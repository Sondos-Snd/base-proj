package com.example.javaudemy.repository;

import com.example.javaudemy.dto.UserDTO;
import com.example.javaudemy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String userEmail);

}
