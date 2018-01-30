package com.fixed.asset.mapper;

import com.fixed.asset.model.User;

public interface UserMapper {
    int add(User user);
    User findOne(User user);
}