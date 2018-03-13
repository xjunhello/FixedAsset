package com.fixed.asset.web;

import java.util.ArrayList;
import java.util.List;

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
import com.fixed.asset.model.User;
import com.fixed.asset.model.UserExample;
import com.fixed.asset.model.UserRoleExample;
import com.fixed.asset.service.RoleService;
import com.fixed.asset.service.UserRoleService;
import com.fixed.asset.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
		@Autowired
		UserRoleService userRoleService;
		
		@Autowired
		UserService userService;
	 	
		@Autowired
		RoleService roleSevice;
		
		@RequestMapping("/get")
	    public String get(Model model,String keywords){
			System.out.println("搜索关键词："+keywords);
			UserExample example = new UserExample();
			if(null!=keywords&&!"".equals(keywords)) {
				example.or().andIsDeleteEqualTo(Constants.IS_DELETE_FALSE).andUserNameLike(keywords);
			}
			List<User> ulist = userService.selectByExample(example);
			if(null==ulist || ulist.size()<=0)
				ulist = new ArrayList<User>();
			model.addAttribute("users", ulist);
			model.addAttribute("keywords", keywords);
	        return "user_list";
	    }
	 	
		@RequestMapping(value = "/modify",method=RequestMethod.GET)
	    public String toAdd(Model model){
	 		model.addAttribute("roles", roleSevice.getRoles(null));
	 		User user = new User();
	 		model.addAttribute("user", user);
	 		model.addAttribute("userRoles", user.getRoles());
	 		return "user_modify";
	    }
		
	 	@RequestMapping(value = "/modify/{userId}",method=RequestMethod.GET)
	    public String toModify(Model model,@PathVariable("userId") String userId){
	 		model.addAttribute("roles", roleSevice.getRoles(null));
	 		
	 		User user = new User();
	 		if(null!=userId)
	 			user = userService.findById(Integer.parseInt(userId));
	 		model.addAttribute("user", user);
	 		model.addAttribute("userRoles", user.getRoles());
	 		return "user_modify";
	    }
	 	
	 	/**
	 	 * 
	 	 * @param model
	 	 * @param user
	 	 * @param roleIds
	 	 * @return
	 	 */
	 	@RequestMapping(value = "/save",method=RequestMethod.POST)
	 	@ResponseBody
	    public String save(Model model,User user,String [] roleIds){
	 		try {
	 			userService.save(user,roleIds);
	 			return new Msg(MsgStat.success,"操作成功！").toJson();
	 		}catch(Exception dae) {
	 			return new Msg(MsgStat.error,"操作失败！",dae.getMessage()).toJson();
	 		}
	    }
	 	

	 	@RequestMapping(value = "/stop/{userId}",method=RequestMethod.GET)
	 	@ResponseBody
	    public String stop(Model model,@PathVariable("userId")String userId){
	 		if(null==userId)
	 			return new Msg(MsgStat.error,"参数错误！").toJson();
	 		try {
	 			User user = userService.findById(Integer.parseInt(userId));
	 			user.setStatus(Constants.USER_STATUS_STOP);
	 			userService.save(user);
	 			return new Msg(MsgStat.success,"操作成功！").toJson();
	 		}catch(Exception dae) {
	 			return new Msg(MsgStat.error,"操作失败！",dae.getMessage()).toJson();
	 		}
	    }
	 	
	 	@RequestMapping(value = "/active/{userId}",method=RequestMethod.GET)
	 	@ResponseBody
	    public String active(Model model,@PathVariable("userId")String userId){
	 		if(null==userId)
	 			return new Msg(MsgStat.error,"参数错误！").toJson();
	 		try {
	 			User user = userService.findById(Integer.parseInt(userId));
	 			user.setStatus(Constants.USER_STATUS_ACTIVE);
	 			userService.save(user);
	 			return new Msg(MsgStat.success,"操作成功！").toJson();
	 		}catch(Exception dae) {
	 			return new Msg(MsgStat.error,"操作失败！",dae.getMessage()).toJson();
	 		}
	    }
	 	
	 	@RequestMapping(value = "/delete",method=RequestMethod.GET)
	 	@ResponseBody
	    public String delete(Model model,String [] userIds){
	 		if(null==userIds || userIds.length ==0)
	 			return new Msg(MsgStat.error,"参数错误！").toJson();
	 		try {
	 			for(String userId : userIds) {
	 				//逻辑删除
		 			User user = userService.findById(Integer.parseInt(userId));
		 			user.setIsDelete(Constants.IS_DELETE_TRUE);
		 			userService.updateByPrimaryKey(user);
	 			}
	 			return new Msg(MsgStat.success,"操作成功！").toJson();
	 		}catch(Exception dae) {
	 			return new Msg(MsgStat.error,"操作失败！",dae.getMessage()).toJson();
	 		}
	    }
}
