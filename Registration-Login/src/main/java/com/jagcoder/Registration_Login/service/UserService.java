package com.jagcoder.Registration_Login.service;

import com.jagcoder.Registration_Login.dto.UserDto;
import com.jagcoder.Registration_Login.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}