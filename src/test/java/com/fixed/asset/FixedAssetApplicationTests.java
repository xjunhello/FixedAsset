package com.fixed.asset;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fixed.asset.model.Role;
import com.fixed.asset.model.User;
import com.fixed.asset.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FixedAssetApplicationTests {
	@Autowired 
	UserService userService;
	
	@Test
	public void contextLoads() {
			List<User> ul = userService.findByName("admin");
			if(ul.size()>0) {
				System.out.println(ul.get(0).getName());
				List<Role> rs = ul.get(0).getRoles();
				if(null!= rs && rs.size() >0) {
					System.out.println(rs.get(0).getName());
				}
			}else {
				System.out.println("测试未通过！");
			}
	}	

}
