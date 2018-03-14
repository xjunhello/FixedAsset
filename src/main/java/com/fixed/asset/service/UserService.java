package com.fixed.asset.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.fixed.asset.common.Constants;
import com.fixed.asset.mapper.UserMapper;
import com.fixed.asset.mapper.UserRoleMapper;
import com.fixed.asset.model.User;
import com.fixed.asset.model.UserExample;
import com.fixed.asset.model.UserRole;
import com.fixed.asset.model.UserRoleExample;
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

    public User save(User user) {
        userMapper.insert(user);
        return findById(user.getUserId());
    }
    
    public List<User> selectByExample(UserExample example) throws DataAccessException{
		return userMapper.selectByExample(example);
	}
    
    public User save(User user,String [] roleIds) throws DataAccessException{
    	//保存用户对象
    	if(user.getUserId()!=null) {
    		userMapper.updateByPrimaryKeySelective(user);
    		List<Integer> rids = new ArrayList<Integer>();
    		for(String roleIdStr : roleIds) {
    			rids.add(Integer.parseInt(roleIdStr));
    		}
    		UserRoleExample ure = new UserRoleExample();
    		ure.or().andUserIdEqualTo(user.getUserId())
    		.andRoleIdIn(rids);
    		userRoleMapper.deleteByExample(ure);
    	}else {
    		user.setCreateTime(new Date());
    		user.setIsDelete(Constants.IS_DELETE_FALSE);
    		user.setStatus(Constants.USER_STATUS_ACTIVE);
    		userMapper.insert(user);
    	}
    	//处理权限映射
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
    
    public long countByExample(UserExample example) throws DataAccessException{
    	return userMapper.countByExample(example);
    }

    public int deleteByExample(UserExample example) throws DataAccessException{
    	return userMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer userId) throws DataAccessException{
    	return userMapper.deleteByPrimaryKey(userId);
    }

    public int insert(User record) throws DataAccessException{
    	return userMapper.insert(record);
    }

    public int insertSelective(User record) throws DataAccessException{
    	return userMapper.insertSelective(record);
    }



    public  User selectByPrimaryKey(Integer userId) throws DataAccessException{
    	return userMapper.selectByPrimaryKey(userId);
    }

    public int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example) throws DataAccessException{
    	return userMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") User record, @Param("example") UserExample example) throws DataAccessException{
    	return userMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(User record) throws DataAccessException{
    	return userMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(User record) throws DataAccessException{
    	return userMapper.updateByPrimaryKey(record);
    }

    public List<User> selectUserAndRolesByExample(UserExample um) throws DataAccessException{
		return userMapper.selectUserAndRolesByExample(um);
	}
}
