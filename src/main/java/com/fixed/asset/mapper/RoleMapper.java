package com.fixed.asset.mapper;

import com.fixed.asset.model.Role;

public interface RoleMapper {
    int add(Role user);
    Role findOne(Role user);
}