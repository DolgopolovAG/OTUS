package ru.otus.lesson12.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.lesson12.controller.dto.UserDto;
import ru.otus.lesson12.controller.dto.mapper.UserMapper;
import ru.otus.lesson12.entity.dao.UserEntityDao;
import ru.otus.lesson12.exception.UserNotFoundException;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserMapper userMapper;
    private final UserEntityDao userDao;

    @Override
    public void create(UserDto user) {
        userDao.save(userMapper.toUserEntity(user));
    }

    @Override
    public UserDto get(long id) {
        return userDao.findById(id).map(userMapper::toUserDto).orElseThrow(UserNotFoundException::new);
    }

    @Override
    public void update(UserDto user) {
        userDao.save(userMapper.toUserEntity(user));
    }

    @Override
    public void delete(long id) {
        userDao.deleteById(id);
    }
}
