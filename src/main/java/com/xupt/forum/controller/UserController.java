package com.xupt.forum.controller;

import com.xupt.forum.entity.User;
import com.xupt.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: forum
 * @author: Semineces
 * @create: 2020-03-30 18:51
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/user")
    public List<User> getUser() {
        System.out.println("测试json数据");
        return userService.getUsers();
    }
}
