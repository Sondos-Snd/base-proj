package com.example.javaudemy.service;

import com.example.javaudemy.dto.UserDTO;
import com.example.javaudemy.entity.User;

import java.util.List;

public interface UserService {

    UserDTO createUser(UserDTO user);

    UserDTO getUserById(Long userId);

    List<UserDTO> getAllUsers();

    UserDTO updateUser(UserDTO user);

    void deleteUser(Long userId);
}
