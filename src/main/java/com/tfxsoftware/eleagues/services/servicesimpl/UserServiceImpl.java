package com.tfxsoftware.eleagues.services.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tfxsoftware.eleagues.entities.User;
import com.tfxsoftware.eleagues.repositories.UserRepository;
import com.tfxsoftware.eleagues.services.UserService;


@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
	private UserRepository userRepository;


    
    public User saveUser(User user){

        user.setSeasonScore(0);
        user.setBalance(1000);
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
