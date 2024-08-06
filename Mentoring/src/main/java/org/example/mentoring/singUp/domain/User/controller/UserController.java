package org.example.mentoring.singUp.domain.User.controller;

import lombok.RequiredArgsConstructor;
import org.example.mentoring.singUp.domain.User.dto.request.SignUpRequest;
import org.example.mentoring.singUp.domain.User.service.SignupService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final SignupService signupService;

    @PostMapping("/signUp")
    public void signUp(@RequestBody SignUpRequest signUpRequest) {
        signupService.userSignup(signUpRequest);
    }
}
