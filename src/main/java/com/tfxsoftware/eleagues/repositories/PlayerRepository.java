package com.tfxsoftware.eleagues.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tfxsoftware.eleagues.entities.Player;

public interface PlayerRepository extends MongoRepository<Player, String> {
    
}