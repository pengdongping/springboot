package com.jt.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestSpringBootMybatis {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testFind() {
    	List<User> findAll = userMapper.selectList(null);
    	System.out.println(findAll);
    }
}
