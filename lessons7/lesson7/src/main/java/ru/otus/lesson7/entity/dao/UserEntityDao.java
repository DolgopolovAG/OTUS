package ru.otus.lesson7.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.lesson7.entity.UserEntity;


public interface UserEntityDao extends JpaRepository<UserEntity, Long> {

}
