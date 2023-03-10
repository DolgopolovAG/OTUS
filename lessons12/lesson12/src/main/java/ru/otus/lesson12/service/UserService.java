package ru.otus.lesson12.service;

import ru.otus.lesson12.controller.dto.UserDto;

public interface UserService {

    void create(UserDto user);

    UserDto get(long id);

    void update(UserDto user);

    void delete(long id);
}