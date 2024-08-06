package org.example.mentoring.singUp.domain.User.service;

import lombok.RequiredArgsConstructor;
import org.example.mentoring.singUp.domain.User.dto.request.SignUpRequest;
import org.example.mentoring.singUp.domain.User.entity.UserEntity;
import org.example.mentoring.singUp.global.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignupService {
    public final UserRepository userRepository;

    public void userSignup(SignUpRequest signUpRequest) {
        UserEntity userEntity = UserEntity.builder()
                .user_name(signUpRequest.getUser_name())
                .user_id(signUpRequest.getUser_id())
                .user_password(signUpRequest.getUser_password())
                .build();

        userRepository.save(userEntity);
    }
}
