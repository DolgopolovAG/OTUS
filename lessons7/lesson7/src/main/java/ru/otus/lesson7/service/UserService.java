package ru.otus.lesson7.service;

import org.apache.catalina.User;
import ru.otus.lesson7.controller.dto.UserDto;

public interface UserService {

    void create(UserDto user);

    UserDto get(long id);

    void update(UserDto user);

    void delete(long id);
}