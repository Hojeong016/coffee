package com.example.coffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SingUpController {

    @PostMapping("/singUpView")
    public String singUpView(Model model) {
        model.addAttribute()
        return "/signIn";
    }

}
