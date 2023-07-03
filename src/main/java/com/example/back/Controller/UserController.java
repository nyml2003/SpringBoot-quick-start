package com.example.back.Controller;
import com.example.back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Map<String,Object> login(@RequestBody Map<String, String> data) {
        String nickname = data.get("nickname");
        String password = data.get("password");

        return userService.login(nickname, password);
    }

    @PostMapping("/register")
    public Map<String,Object> register(@RequestBody Map<String, String> data) {
        String nickname = data.get("nickname");
        String password = data.get("password");
        return userService.register(nickname, password);
    }

    @PostMapping("/insertHistory")
    public Map<String,Object> insertHistory(@RequestBody Map<String, String> data) {
        int level = Integer.parseInt(data.get("level"));
        int time = Integer.parseInt(data.get("time"));
        int money = Integer.parseInt(data.get("money"));
        int user_id = Integer.parseInt(data.get("user_id"));
        boolean is_game_over = Boolean.parseBoolean(data.get("is_game_over"));
        return userService.insertHistory(level,time,money,user_id,is_game_over);
    }

    @PostMapping("/getHistory")
    public Map<String,Object> getHistoryByUserId(@RequestBody Map<String, String> data) {
        int user_id = Integer.parseInt(data.get("user_id"));
        return userService.getHistoryByUserId(user_id);
    }


}
