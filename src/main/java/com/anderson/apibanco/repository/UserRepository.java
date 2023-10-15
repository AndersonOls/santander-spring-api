package com.anderson.apibanco.repository;

import com.anderson.apibanco.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
