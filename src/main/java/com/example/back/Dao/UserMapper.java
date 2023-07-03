package com.example.back.Dao;
import com.example.back.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    List<User> findAllUsers();
}
