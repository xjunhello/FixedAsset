package com.fixed.asset;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fixed.asset.mapper.RoleMapper;
import com.fixed.asset.mapper.UserMapper;
import com.fixed.asset.mapper.UserRoleMapper;
import com.fixed.asset.model.Role;
import com.fixed.asset.model.RoleExample;
import com.fixed.asset.model.User;
import com.fixed.asset.model.UserExample;
import com.fixed.asset.model.UserRole;
import com.fixed.asset.model.UserRoleExample;
import com.fixed.asset.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FixedAssetApplicationTests {
	@Autowired 
	UserService userService;
	@Autowired
	UserMapper userMapper;
	@Autowired
	UserRoleMapper userRoleMapper;
	@Autowired
	RoleMapper roleMapper;
	@Test
	public void contextLoads() {
		
			List<User> ul = userService.findByName("admin");
			if(ul.size()>0) {
				System.out.println(ul.get(0).getUserName());
				List<Role> rs = ul.get(0).getRoles();
				if(null!= rs && rs.size() >0) {
					System.out.println(rs.get(0).getRoleName());
				}
			}else {
				System.out.println("测试未通过！");
			}
	}	
//	
//	@Test
//	public void getRolesByUserName() {
//		UserExample um = new UserExample();
//		um.createCriteria().andUserNameEqualTo("admin");
//		List<User> ulist = userMapper.selectByExample(um);
//		if(ulist==null || ulist.size()<=0)
//			return ;
//		User u;
//		u = ulist.get(0);
//		UserRoleExample ure = new UserRoleExample();
//		ure.createCriteria().andUserIdEqualTo(u.getUserId());
//		List<UserRole> urlist = userRoleMapper.selectByExample(ure);
//		if(urlist == null || urlist.size()<=0)
//			return;
//		List<Integer> rids = new ArrayList<Integer>();
//		for(UserRole ur : urlist) {
//			rids.add(ur.getRoleId());
//		}
//		RoleExample re = new RoleExample();
//		re.createCriteria().andRoleIdIn(rids);
//		List<Role> rlist = roleMapper.selectByExample(re);
//		if(rlist!=null || rlist.size()>0) {
//			for(Role r: rlist) {
//				System.out.println("role=="+r.getRoleId()+":::"+r.getRoleName());
//			}
//		}
//		
//	}
//	
//	@Test
//	public void testUserAndRole(){
//		UserExample ue = new UserExample();
//		ue.createCriteria().andUserNameEqualTo("admin");
//		List<User> u = userMapper.selectUserAndRolesByExample(ue);
//		List<Role> rlist = u.get(0).getRoles();
//		if(rlist != null )
//			System.out.println(rlist.size()+"---"+rlist.get(0).getRoleName());
//	}

}
