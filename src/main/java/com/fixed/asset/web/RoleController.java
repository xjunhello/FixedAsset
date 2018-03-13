package com.fixed.asset.web;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fixed.asset.common.Constants;
import com.fixed.asset.model.Msg;
import com.fixed.asset.model.MsgStat;
import com.fixed.asset.model.Resource;
import com.fixed.asset.model.RoleExample;
import com.fixed.asset.model.RoleResourceKey;
import com.fixed.asset.model.Role;
import com.fixed.asset.service.RoleService;
import com.fixed.asset.service.ResourceService;

@Controller
@RequestMapping("/role")
public class RoleController {
	
		private final Logger logger = LoggerFactory.getLogger(this.getClass());
		

		
		@Autowired
		RoleService roleService;
		
		@Autowired
		ResourceService resourceService;
		
		@RequestMapping("/get")
	    public String get(Model model,String keywords){
			System.out.println("搜索关键词："+keywords);
			RoleExample example = new RoleExample();
			if(null!=keywords&&!"".equals(keywords)) {
				example.or().andRoleNameLike(keywords);
				example.or().andRemarkLike(keywords);
			}
			List<Role> list;
			try {
				list = roleService.selectByExample(example);
				if(null==list || list.size()<=0)
					list = new ArrayList<Role>();
			} catch (Exception e) {
				logger.error("角色管理，系统异常。",e);
				list = new ArrayList<Role>();
			}
			model.addAttribute("roles", list);
			model.addAttribute("keywords", keywords);
	        return "role_list";
	    }
	 	
	 	@RequestMapping(value = "/modify/{roleId}",method=RequestMethod.GET)
	    public String toModify(Model model,@PathVariable("roleId") String roleId){
	 		
	 		Role role = new Role();
	 		List<Resource> resources = new ArrayList<Resource>();
	 		if(null!=roleId)
				try {
					resources = resourceService.selectByExample(null);
					role = roleService.selectByPrimaryKey(Integer.parseInt(roleId));
				} catch (NumberFormatException e) {
					role = new Role();
					role.setResources(new ArrayList<Resource>());
					logger.error("角色管理，系统异常。",e);
				} catch (Exception e) {
					role = new Role();
					role.setResources(new ArrayList<Resource>());
					logger.error("角色管理，系统异常。",e);
				}
	 		model.addAttribute("resources", resources);
	 		model.addAttribute("role", role);
	 		model.addAttribute("roleResources", role.getResources());
	 		return "role_modify";
	    }
	 	

	 	@RequestMapping(value = "/save",method=RequestMethod.POST)
	 	@ResponseBody
	    public String save(Model model,Role role,String [] resources){
	 		try {
	 			roleService.save(role,resources);
	 			return new Msg(MsgStat.success,"操作成功！").toJson();
	 		}catch(Exception dae) {
	 			return new Msg(MsgStat.error,"操作失败！",dae.getMessage()).toJson();
	 		}
	    }
	 	

	 	
	 	@RequestMapping(value = "/delete/{roleId}",method=RequestMethod.GET)
	 	@ResponseBody
	    public String delete(Model model,@PathVariable("roleId")String roleId){
	 		if(null==roleId)
	 			return new Msg(MsgStat.error,"参数错误！").toJson();
	 		try {
	 			//物理删除
	 			roleService.deleteByPrimaryKey(Integer.parseInt(roleId));
	 			return new Msg(MsgStat.success,"操作成功！").toJson();
	 		}catch(Exception dae) {
	 			return new Msg(MsgStat.error,"操作失败！",dae.getMessage()).toJson();
	 		}
	    }
}
