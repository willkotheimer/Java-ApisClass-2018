package com.cooksys.ftd.ormdemo.service;

import com.cooksys.ftd.ormdemo.dto.UserDto;
import com.cooksys.ftd.ormdemo.entity.User;
import com.cooksys.ftd.ormdemo.mapper.UserMapper;
import com.cooksys.ftd.ormdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    private UserMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public User getUser(Long employeeId) {
        return this.userRepository.findUserByEmployeeId(employeeId);
    }

    public User saveUser(UserDto userDto) {
        return this.userRepository.save(this.userMapper.dtoToEntity(userDto));
    }

    public List<User> getUsers() {
        return this.userRepository.findAll();
    }
}
