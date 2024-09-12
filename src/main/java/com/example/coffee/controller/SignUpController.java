package com.example.coffee.controller;

import com.example.coffee.dto.SignUpDTO;
import com.example.coffee.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signUp")
public class SignUpController {

    private final UserService userService;

    public SignUpController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signUp")
    public String signUpView(Model model){
        return "signUp";
    }

    @PostMapping("/signUpForm")
    public String singUpView(@ModelAttribute("SignUpDto") SignUpDTO signUpDTO, Model model) {
        try {
            userService.signUp(signUpDTO);
            return "/signIn";
        }catch (Exception e){
            model.addAttribute("error", e.getMessage());
            return "/signUp";
        }



    }

}
