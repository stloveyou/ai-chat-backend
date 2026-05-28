package com.stloveyou.ai_chat_backend.controller;

import com.stloveyou.ai_chat_backend.entity.User;
import com.stloveyou.ai_chat_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "hello AI Backend!";
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }
}