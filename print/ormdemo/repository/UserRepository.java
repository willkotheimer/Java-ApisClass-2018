package com.cooksys.ftd.ormdemo.repository;

import com.cooksys.ftd.ormdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByEmployeeId(Long employeeId);

    List<User> findUserByFirstName(String name);

    List<User> findAll();

}
