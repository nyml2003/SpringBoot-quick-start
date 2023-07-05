package com.example.back.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.back.entity.LearnUser;
import com.example.back.service.LearnUserService;
import com.example.back.mapper.LearnUserMapper;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【learn_user】的数据库操作Service实现
* @createDate 2023-07-05 10:37:33
*/
@Service
public class LearnUserServiceImpl extends ServiceImpl<LearnUserMapper, LearnUser>
    implements LearnUserService{

}




