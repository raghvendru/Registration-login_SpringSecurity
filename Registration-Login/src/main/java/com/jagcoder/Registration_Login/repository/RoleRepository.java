package com.jagcoder.Registration_Login.repository;

import com.jagcoder.Registration_Login.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}

