package com.example.back.controller;

import com.example.back.service.LearnUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class LearnUserController {
    private final LearnUserService learnUserService;

    public LearnUserController(LearnUserService learnUserService) {
        this.learnUserService = learnUserService;
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/test2")
    public List<HashMap<String,Object>> test2(){
        List<HashMap<String,Object>> map = new ArrayList<>();
        for (int i=1; i<=learnUserService.count(); i++){
            map.add(new HashMap<>(learnUserService.getById(i).toHashMap()));
        }
        return map;
    }

}




//@RestController
//public class LearnController {
//    @Autowired
//    private LearnServiceImpl learnService;
//
//    @GetMapping("/test")
//    public String test(){
//        return "test";
//    }
//
//    @GetMapping("/test2")
//    public Map<String,Object> test2(){
//        return new HashMap<String,Object>(){{
//            put("id",learnService.getById(1L).getId());
//            put("name",learnService.getById(1L).getName());
//            put("age",learnService.getById(1L).getAge());
//            put("email",learnService.getById(1L).getEmail());
//        }};
//    }
//}