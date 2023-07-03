package com.example.back.Entity;
import lombok.Data;
@Data
public class User {
    private int uid;
    private String username;
    private String password;
    private String role;
}
