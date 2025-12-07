package com.javatechie.service;

import com.javatechie.client.UserClient;
import com.javatechie.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserClient userClient;

    public List<UserDto> getAllUsers() {
        return userClient.getAllUsers();
    }

    public UserDto getUserById(int id) {
        return userClient.getUserById(id);
    }
}
