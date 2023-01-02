package com.tfxsoftware.eleagues.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tfxsoftware.eleagues.entities.User;

public interface UserRepository extends MongoRepository<User, String> {
    
}
