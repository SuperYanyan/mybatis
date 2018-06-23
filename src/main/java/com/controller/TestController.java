package com.controller;

import com.db.mapper.UserMapper;
import com.db.model.User;
import com.db.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/path")
    public String testMethod() {
        UserExample userExample = new UserExample();
        List<User> userList = userMapper.selectByExample(userExample);
        System.out.println(userList.size());
        return "zhangyan";
    }

    @GetMapping("/test")
    public String getTest() {
        return "hello world";
    }

}
