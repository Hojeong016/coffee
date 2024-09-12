package com.example.coffee.service;

import com.example.coffee.domain.User;
import com.example.coffee.dto.SignUpDTO;

public interface UserService  {
    User signUp(SignUpDTO signUpDto);
}
