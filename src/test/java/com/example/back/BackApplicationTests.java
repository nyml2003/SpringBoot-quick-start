package com.example.back;



import com.example.back.Dao.LearnMapper;
import com.example.back.Entity.LearnUser;
import com.example.back.Service.LearnService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;


@SpringBootTest
class BackApplicationTests {
    @Resource
    private LearnService learnService;

    @Resource
    private LearnMapper learnMapper;


    @Test
    void testSelectList(){
        //通过条件构造器查询一个list集合，若没有条件，则可以设置null为参数
        List<LearnUser> users = learnMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testGetCount(){
        //查询总记录数
        //执行的SQL为：SELECT COUNT( * ) FROM user
        long count = learnService.count();
        System.out.println("总记录数：" + count);
    }

}
