package com.fixed.asset.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fixed.asset.mapper.UserMapper;
import com.fixed.asset.model.Role;
import com.fixed.asset.model.User;
import com.fixed.asset.model.UserExample;

@Service
public class CustomUserDetailService implements UserDetailsService {
	@Autowired
	UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) { // 重写loadUserByUsername 方法获得 userdetails 类型用户
		User temp = new User();
		temp.setName(username);
		UserExample example = new UserExample();
		example.createCriteria().andNameEqualTo(username.trim());
		List<User> us = userMapper.selectByExample(example);
		if (us == null || us.size()<=0) {
			throw new UsernameNotFoundException("用户名不存在");
		}
		if(us.size()>1) {
			throw new RuntimeException("系统错误！");
		}
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		// 用于添加用户的权限。只要把用户权限添加到authorities 就万事大吉。
		for (Role role : us.get(0).getRoles()) {
			authorities.add(new SimpleGrantedAuthority(role.getName()));
			System.out.println(role.getName());
		}
		return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), authorities);
	}
}
