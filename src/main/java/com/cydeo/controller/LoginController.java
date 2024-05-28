package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LoginController {
    @GetMapping("/login/{email}/{phoneNumber}")
    public String loginInfo(@PathVariable String email, @PathVariable String phoneNumber, Model model){
        model.addAttribute("email",email);
        model.addAttribute("phoneNumber",phoneNumber);
        model.addAttribute("loginMessage","Log in Successful");

        return "/login/login-info";
    }
}
