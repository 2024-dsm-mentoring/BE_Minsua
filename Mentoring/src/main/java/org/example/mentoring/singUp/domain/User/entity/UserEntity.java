package org.example.mentoring.singUp.domain.User.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String user_name;

    @Column(unique = true)
    private String user_id;

    private String user_password;

    @Builder
    public UserEntity(String user_name, String user_id, String user_password) {
        this.user_name = user_name;
        this.user_id = user_id;
        this.user_password = user_password;
    }
}
