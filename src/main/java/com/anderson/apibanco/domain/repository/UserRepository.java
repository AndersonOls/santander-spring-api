package com.anderson.apibanco.domain.repository;

import com.anderson.apibanco.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
