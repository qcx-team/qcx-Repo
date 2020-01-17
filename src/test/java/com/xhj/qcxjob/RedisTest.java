package com.xhj.qcxjob;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: WM
 * @Date: 2020/1/16 15:08
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private StringRedisTemplate template;

    /**
     * set redis by key value
     */
    @Test
    public void setRedis() {
        template.opsForValue().set("string","12312312312");

//      template.opsForValue().set("json:user:name","weimin2");
    }

    /**
     * get redis by key
     */
    @Test
    public void getRedis() {
        System.out.println("string"+template.opsForValue().get("string"));
    }

}
