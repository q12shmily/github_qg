package com.baizhi.test;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestSpringboot extends BaseTest{
    @Autowired
    UserService userService;
    @Test
    public void Test(){
        User user = new User();
        user.setUsername("Tom");
        user.setPassword("1");
        User item = userService.findItem(user);
        System.out.println(item);
    }
    @Test
    public void Test1(){
        User user = new User();
        user.setName("a");
        user.setUsername("a");
        user.setPassword("aa");
        user.setSex("男");
        userService.add(user);
    }
}
