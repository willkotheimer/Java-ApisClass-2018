package com.cooksys.ftd.ormdemo.controller;

import com.cooksys.ftd.ormdemo.dto.UserDto;
import com.cooksys.ftd.ormdemo.entity.User;
import com.cooksys.ftd.ormdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("user/{employeeId}")
    public User getUser(@PathVariable("employeeId") Long employeeId) {
        return this.userService.getUser(employeeId);
    }

    @GetMapping("user")
    public List<User> getUsers() {
        return this.userService.getUsers();
    }

    @PostMapping("user")
    public User saveUser(@RequestBody UserDto user) {
        return this.userService.saveUser(user);
    }
}
