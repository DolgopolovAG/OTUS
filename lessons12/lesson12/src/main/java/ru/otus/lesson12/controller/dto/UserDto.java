package ru.otus.lesson12.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Integer userStatus;
}
