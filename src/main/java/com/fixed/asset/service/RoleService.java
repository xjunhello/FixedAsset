package com.fixed.asset.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fixed.asset.mapper.RoleMapper;
import com.fixed.asset.mapper.RoleResourceMapper;
import com.fixed.asset.mapper.UserMapper;
import com.fixed.asset.mapper.UserRoleMapper;
import com.fixed.asset.model.Role;
import com.fixed.asset.model.RoleExample;
import com.fixed.asset.model.User;
import com.fixed.asset.model.UserExample;
import com.fixed.asset.model.UserRole;
import com.fixed.asset.model.UserRoleKey;


@Service("roleService")
public class RoleService {
	
	@Autowired
	private RoleMapper roleMapper;
    
	@Autowired
    private RoleResourceMapper rrMapper;
	
	public List<Role> getRoles(RoleExample example){
		return roleMapper.selectByExample(example);
	}
}
