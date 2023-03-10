package ru.otus.lesson12.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.lesson12.entity.UserEntity;


public interface UserEntityDao extends JpaRepository<UserEntity, Long> {

}
