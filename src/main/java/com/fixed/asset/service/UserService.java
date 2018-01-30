package com.fixed.asset.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fixed.asset.mapper.UserMapper;
import com.fixed.asset.model.User;


@Service
public class UserService {
    private UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User add(User user) {
        userMapper.add(user);
        return findById(user.getId());
    }

    public User findById(int id) {
        User user = new User();
        user.setId(id);
        return userMapper.findOne(user);
    }

    public User findByName(String name) {
        User param = new User();
        param.setName(name);
        return userMapper.findOne(param);
    }
}
