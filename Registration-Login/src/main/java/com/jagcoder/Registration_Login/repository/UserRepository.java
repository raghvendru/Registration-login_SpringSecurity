package com.jagcoder.Registration_Login.repository;

import com.jagcoder.Registration_Login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
