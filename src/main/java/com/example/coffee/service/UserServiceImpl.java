package com.example.coffee.service;

import com.example.coffee.domain.User;
import com.example.coffee.dto.SignUpDTO;
import com.example.coffee.repository.UserServiceRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserServiceRepository userServiceRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(UserServiceRepository userServiceRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userServiceRepository = userServiceRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public User signUp(SignUpDTO signUpDto) {
        //회원 중복 검사
        String accountId = signUpDto.getAccountId();
        if(userServiceRepository.findByAccountId(accountId) != null) {
            System.out.println("이미 회원가입이 완료된 유저입니다.");
        }

        User user = new User();
        user.setAccountId(signUpDto.getAccountId());
        user.setPassword(bCryptPasswordEncoder.encode(signUpDto.getPassword()));
        user.setName(signUpDto.getName());
        user.setEmail(signUpDto.getEmail());

        return userServiceRepository.save(user);
    }
}
