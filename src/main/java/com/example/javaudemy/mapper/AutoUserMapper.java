package com.example.javaudemy.mapper;

import com.example.javaudemy.dto.UserDTO;
import com.example.javaudemy.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER= Mappers.getMapper(AutoUserMapper.class);
    // has to have the same field names
//    @Mapping(source="email",target="emailAddress")
    UserDTO mapToUserDto(User user);
    User mapToUser(UserDTO userDto);
}
