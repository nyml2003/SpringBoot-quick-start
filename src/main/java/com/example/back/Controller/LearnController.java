package com.example.back.Controller;

import com.example.back.Service.impl.LearnServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LearnController {
    @Autowired
    private LearnServiceImpl learnService;

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/test2")
    public Map<String,Object> test2(){
        return new HashMap<String,Object>(){{
            put("id",learnService.getById(1L).getId());
            put("name",learnService.getById(1L).getName());
            put("age",learnService.getById(1L).getAge());
            put("email",learnService.getById(1L).getEmail());
        }};
    }
}
