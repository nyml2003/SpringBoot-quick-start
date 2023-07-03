package com.example.back.Dao;
import com.example.back.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface UserMapper {
    List<User> findUserByNickname(String nickname);

    void registerUser(String nickname, String password);

    void insertHistory(int level,int time,int money,int user_id,boolean is_game_over);

    List<Map<String,Object>> getHistoryByUserId(int user_id);

}
