package com.example.back.Service;


import org.springframework.stereotype.Service;
import com.example.back.Entity.User;
import com.example.back.Dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Map<String,Object> login(String nickname, String password) {
        List<User> users = userMapper.findUserByNickname(nickname);
        if (users.size() == 0) {
            return new HashMap<String,Object>(){{
                put ("msg","该昵称对应的用户不存在");
            }};
        } else if (users.size() > 1) {
            return new HashMap<String,Object>(){{
                put ("msg","该昵称对应的用户不止一个");
            }};
        } else if (users.get(0).getPassword().equals(password)) {
            return new HashMap<String,Object>(){{
                put ("msg","登录成功");
                put ("id",users.get(0).getId());
                put ("nickname",users.get(0).getNickname());
            }};
        } else {
            return new HashMap<String,Object>(){{
                put ("msg","密码错误");
            }};
        }
    }

    public Map<String,Object> register(String nickname, String password) {
        List<User> users = userMapper.findUserByNickname(nickname);
        if (users.size() > 0) {
            return new HashMap<String,Object>(){{
                put ("msg","该昵称对应的用户已存在");
            }};
        } else {
            userMapper.registerUser(nickname, password);
            return new HashMap<String,Object>(){{
                put ("msg","注册成功");
            }};
        }
    }

    public Map<String,Object> insertHistory(int level,int time,int money,int user_id,boolean is_game_over){
        userMapper.insertHistory(level,time,money,user_id,is_game_over);
        return new HashMap<String,Object>(){{
            put ("msg","游戏数据保存成功");
        }};
    }

    public Map<String,Object> getHistoryByUserId(int user_id){
        List<Map<String, Object>> history = userMapper.getHistoryByUserId(user_id);
        return new HashMap<String,Object>(){{
            put ("msg","游戏数据获取成功");
            put ("history",history);
        }};
    }
}