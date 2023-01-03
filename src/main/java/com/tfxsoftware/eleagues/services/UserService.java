package com.tfxsoftware.eleagues.services;

import java.util.List;

import com.tfxsoftware.eleagues.entities.User;

public interface UserService {
    
    public User saveUser(User user);

    public List<User> getAllUsers();
}
