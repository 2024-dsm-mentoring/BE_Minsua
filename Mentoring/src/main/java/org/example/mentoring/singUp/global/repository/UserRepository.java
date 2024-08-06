package org.example.mentoring.singUp.global.repository;

import org.example.mentoring.singUp.domain.User.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
