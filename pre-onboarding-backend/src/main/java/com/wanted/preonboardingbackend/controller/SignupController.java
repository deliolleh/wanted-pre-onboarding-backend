package com.wanted.preonboardingbackend.controller;

import com.wanted.preonboardingbackend.service.SignupService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "api/signup")
public class SignupController {

    public final SignupService signupService;

    public SignupController(SignupService signupService) {
        this.signupService = signupService;
    }

    @PostMapping("/user")
    public static void userSignup(@RequestBody Map<String, String> req) {
    }
}
