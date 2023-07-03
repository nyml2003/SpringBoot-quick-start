package com.example.back.Entity;

import lombok.Data;

@Data
public class History {
    private int id;
    private int level;
    private int time;
    private int money;
    private int user_id;
    private boolean is_game_over;
}
