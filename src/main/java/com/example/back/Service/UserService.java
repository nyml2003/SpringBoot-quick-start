package com.example.back.Service;


import org.springframework.stereotype.Service;
import com.example.back.Entity.User;
import com.example.back.Dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }
}