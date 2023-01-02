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
public class User {
    
    @Id
	private String idUser;
	
    private String username;
	private String email;
    private String password;
	private String country;
    private String teamName;
	private String[] players;
    private String[] competitions;
    private float seasonScore;
    private double balance;
    private String[] matches;
    
    public User(String username, String email, String password, String country, String teamName){
        this.username = username;
        this.email = email;
        this.password = password;
        this.country = country;
        this.teamName = teamName;

    }
}
