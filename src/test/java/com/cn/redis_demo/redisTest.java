package com.cn.redis_demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Component
public class redisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void set(){

        System.out.println("1111111111");
        redisTemplate.opsForValue().set("name","小明");

    }

}
