package org.example.mentoring.singUp.domain.User.dto.request;

import lombok.Getter;

@Getter
public class SignUpRequest {
    private String user_name;
    private String user_id;
    private String user_password;
}
