package com.example.back.Service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.back.Dao.LearnMapper;
import com.example.back.Service.LearnService;
import org.springframework.stereotype.Service;
import com.example.back.Entity.LearnUser;


@Service
public class LearnServiceImpl extends ServiceImpl<LearnMapper, LearnUser> implements LearnService {

}
