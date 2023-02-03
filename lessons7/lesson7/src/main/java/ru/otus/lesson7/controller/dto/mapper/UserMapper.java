package ru.otus.lesson7.controller.dto.mapper;

import org.mapstruct.Mapper;
import ru.otus.lesson7.controller.dto.UserDto;
import ru.otus.lesson7.entity.UserEntity;


@Mapper
public interface UserMapper {
    UserDto toUserDto(UserEntity user);

    UserEntity toUserEntity(UserDto userDto);



}
