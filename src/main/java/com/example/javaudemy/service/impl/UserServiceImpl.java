package com.example.javaudemy.service.impl;

import com.example.javaudemy.dto.UserDTO;
import com.example.javaudemy.exception.EmailAlreadyExistsException;
import com.example.javaudemy.exception.ResourceNotFoundException;
import com.example.javaudemy.mapper.AutoUserMapper;
import com.example.javaudemy.mapper.UserMapper;
import com.example.javaudemy.repository.UserRepository;
import com.example.javaudemy.entity.User;
import com.example.javaudemy.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private ModelMapper modelMapper;

    @Override
    public UserDTO createUser(UserDTO userDto) {
//        User user=UserMapper.mapToUser(userDto);
//        User user=modelMapper.map(userDto,User.class);
        User user= AutoUserMapper.MAPPER.mapToUser(userDto);
        Optional<User> userByEmail = userRepository.findByEmail(userDto.getEmail());
        if(userByEmail.isPresent()){
            throw new EmailAlreadyExistsException("Email already exists");
        }
//        User savedUser=userRepository.save(userByEmail.orElseThrow(
//                () -> new EmailAlreadyExistsException("Email already Exists"))
//        );
//        UserDTO savedUserDto= UserMapper.mapToUserDto(savedUser);
//        UserDTO savedUserDto=modelMapper.map(savedUser,UserDTO.class);
        User savedUser=userRepository.save(user);
        return AutoUserMapper.MAPPER.mapToUserDto(savedUser);
    }

    @Override
    public UserDTO getUserById(Long userId) {
        User user=  userRepository.findById(userId).orElseThrow(
                ()->new ResourceNotFoundException("User","id",userId)
        );
//        User returnedUser=null;
//        if (optionalUser.isPresent()) {
//            returnedUser = optionalUser.get();
//        }
////        UserDTO mappedUser=UserMapper.mapToUserDto(returnedUser);
//        UserDTO mappedUser=modelMapper.map(returnedUser,UserDTO.class);
        return AutoUserMapper.MAPPER.mapToUserDto(user);
    }

    @Override
    public List<UserDTO> getAllUsers() {

        List<User> listAllUsers=userRepository.findAll();
//        List<UserDTO> listUsersDto=listAllUsers.stream().map(user->UserMapper.mapToUserDto(user)).toList();
//        return listAllUsers.stream().map((user)->modelMapper.map(user,UserDTO.class)).collect(Collectors.toList());
        return listAllUsers.stream().map(AutoUserMapper.MAPPER::mapToUserDto).collect(Collectors.toList());
    }

    @Override
    public UserDTO updateUser(UserDTO user) {
        User existingUser=userRepository.findById(user.getId()).orElseThrow(
                ()->new ResourceNotFoundException("User","id",user.getId())
        );
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        User updatedUser=userRepository.save(existingUser);
//        UserDTO updatedUserDto = UserMapper.mapToUserDto(updatedUser);
//        UserDTO updatedUserDto=modelMapper.map(updatedUser,UserDTO.class);
        return AutoUserMapper.MAPPER.mapToUserDto(updatedUser);
    }

    @Override
    public void deleteUser(Long userId) {
        User existingUser=userRepository.findById(userId).orElseThrow(
                ()->new ResourceNotFoundException("User","id",userId)
        );
        userRepository.deleteById(userId);
    }
}
