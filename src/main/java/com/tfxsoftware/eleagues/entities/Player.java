package com.tfxsoftware.eleagues.entities;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    @Id
	private String idPlayer;
	
    private String nickname;
	private String role;
    private float price;
    
    
    public Player(String nickname, String role) {
        this.nickname = nickname;
        this.role = role;
    }
}
