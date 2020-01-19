package com.xhj.qcxjob.controller;

import com.xhj.qcxjob.bean.TUser;
import com.xhj.qcxjob.service.TUserSevice;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.IntegerSyntax;

/**
 * @Author: WM
 * @Date: 2020/1/16 15:26
 * @Description: only test
 */
@RestController
@RequestMapping("/redis")

public class RedisController {

    @Autowired
    private StringRedisTemplate template;

    @Autowired
    private TUserSevice tUserSevice;

    @ApiOperation(value="redis获取value的测试", notes="")
    @GetMapping("/test")
    public String test(){
//        System.out.println("string"+template.opsForValue().get("string"));
        System.out.println("本地没有Redis，敬请期待");

        return "ok";
    }

    @ApiOperation(value="获取单个User对象信息", notes="")
    @GetMapping("/getUser")
    public TUser getUserById(Integer id){
        TUser user= tUserSevice.getUserById(id);
        return user;
    }
}
