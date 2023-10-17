package com.anderson.apibanco.service;

import com.anderson.apibanco.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

}
