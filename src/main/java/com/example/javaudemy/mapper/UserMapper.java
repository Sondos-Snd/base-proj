package com.example.javaudemy.mapper;

import com.example.javaudemy.dto.UserDTO;
import com.example.javaudemy.entity.User;

public class UserMapper {

    public static UserDTO mapToUserDto(User user){

        UserDTO userDTO=new UserDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDTO;
    }

    public static User mapToUser(UserDTO userDto){

        User user=new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return user;
    }
}
