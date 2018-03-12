package com.fixed.asset.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.fixed.asset.mapper.UserMapper;
import com.fixed.asset.mapper.UserRoleMapper;
import com.fixed.asset.model.User;
import com.fixed.asset.model.UserExample;
import com.fixed.asset.model.UserRole;
import com.fixed.asset.model.UserRoleKey;


@Service
public class UserService {
    
	private UserMapper userMapper;
    
	
	@Autowired
    private UserRoleMapper userRoleMapper;
    
    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User add(User user) {
        userMapper.insert(user);
        return findById(user.getUserId());
    }
    
    public List<User> selectByExample(UserExample example) throws DataAccessException{
		return userMapper.selectByExample(example);
	}
    
    public User add(User user,String [] roleIds) throws DataAccessException{
         userMapper.insert(user);
        if(null!=roleIds && roleIds.length>0 ) {
        	for(String roleId : roleIds) {
        		UserRoleKey ur = new UserRoleKey();
        		ur.setUserId(user.getUserId());
        		ur.setRoleId(Integer.parseInt(roleId));
        		userRoleMapper.insert(ur);
        	}
        }
        return findById(user.getUserId());
    }

    public User findById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> findByName(String name) {
        UserExample um = new UserExample();
        um.createCriteria().andUserNameLike(name);
        return userMapper.selectUserAndRolesByExample(um);
    }
}
