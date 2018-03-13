package com.fixed.asset.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fixed.asset.mapper.UserRoleMapper;
import com.fixed.asset.model.UserRoleExample;
import com.fixed.asset.model.UserRoleKey;

@Service("userRoleService")
public class UserRoleService {
		@Autowired
		private UserRoleMapper userRoleMapper;
		
	    public long countByExample(UserRoleExample example) {
	    	return userRoleMapper.countByExample(example);
	    }

	    public int deleteByExample(UserRoleExample example) {
	    	return userRoleMapper.deleteByExample(example);
	    }

	    public int deleteByPrimaryKey(UserRoleKey key) {
	    	return userRoleMapper.deleteByPrimaryKey(key);
	    }

	    public int insert(UserRoleKey record) {
	    	return userRoleMapper.insert(record);
	    }

	    public int insertSelective(UserRoleKey record) {
	    	return userRoleMapper.insertSelective(record);
	    }

	    public List<UserRoleKey> selectByExample(UserRoleExample example){
	    	return userRoleMapper.selectByExample(example);
	    }

	    public int updateByExampleSelective(@Param("record") UserRoleKey record, @Param("example") UserRoleExample example) {
	    	return userRoleMapper.updateByExample(record, example);
	    }

	    public int updateByExample(@Param("record") UserRoleKey record, @Param("example") UserRoleExample example) {
	    	return userRoleMapper.updateByExample(record, example);
	    }

}
