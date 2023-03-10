package ru.otus.lesson12.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.otus.lesson12.controller.dto.UserDto;
import ru.otus.lesson12.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user/")
public class UserController {

    private final UserService userService;

    @DeleteMapping("/{userId}")
     public ResponseEntity<?> userIdDelete(@PathVariable("userId") Long id) {
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> userIdGet(@PathVariable("userId") Long id) {
        return new ResponseEntity<>(userService.get(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> userPost(@RequestBody UserDto user) {
        userService.create(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<?> userPut(@PathVariable("userId") Long id, @RequestBody UserDto user) {
        user.setId(id);
        userService.update(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/error")
    public ResponseEntity<?> ErrorGet() {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
