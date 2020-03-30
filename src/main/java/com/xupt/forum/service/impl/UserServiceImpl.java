package com.xupt.forum.service.impl;

import com.xupt.forum.entity.User;
import com.xupt.forum.mapper.UserMapper;
import com.xupt.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: forum
 * @author: Semineces
 * @create: 2020-03-30 18:55
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }
}
