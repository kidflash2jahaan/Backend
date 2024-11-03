package com.systemerr.backend.sudoku;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class User {
    @Id
    private String username;
    private String password;
    private String location;
    
    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.location = "/users/" + username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getLocation() {
        return location;
    }
}
