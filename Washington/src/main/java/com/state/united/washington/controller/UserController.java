package com.state.united.washington.controller;

import com.state.united.washington.model.User;
import com.state.united.washington.service.UserService;
import entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/user/{id}")
    @ResponseBody
    public UserEntity getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

    @PostMapping(value = "/user/")
    public long setUser(@RequestBody User user){
        return userService.setUser(user);
    }
}
