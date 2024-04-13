package com.MongoSpring.MongoSpring.Model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admin")
public class AdminDetails {
    private String username;
    private long password;

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
