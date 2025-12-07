package com.javatechie.client;

import com.javatechie.dto.UserDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange("https://jsonplaceholder.typicode.com/users")
public interface UserClient {

    @GetExchange("/{id}")
    public UserDto getUserById(@PathVariable int id);

    @GetExchange
    public List<UserDto> getAllUsers() ;
}
