package com.stloveyou.ai_chat_backend.service;

import com.stloveyou.ai_chat_backend.entity.User;
import com.stloveyou.ai_chat_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        return userRepository.save(user);
    }
}