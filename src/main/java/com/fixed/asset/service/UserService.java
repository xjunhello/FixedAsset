package com.fixed.asset.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fixed.asset.mapper.UserMapper;
import com.fixed.asset.model.User;
import com.fixed.asset.model.UserExample;


@Service
public class UserService {
    private UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User add(User user) {
        userMapper.insert(user);
        return findById(user.getId());
    }

    public User findById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> findByName(String name) {
        UserExample um = new UserExample();
        um.createCriteria().andNameLike(name);
        return userMapper.selectByExample(um);
    }
}
