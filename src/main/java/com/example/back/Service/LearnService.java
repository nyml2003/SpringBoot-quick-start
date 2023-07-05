package com.example.back.Service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.back.Entity.LearnUser;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public interface LearnService extends IService<LearnUser> {
}
