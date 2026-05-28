package com.stloveyou.ai_chat_backend.repository;

import com.stloveyou.ai_chat_backend.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}