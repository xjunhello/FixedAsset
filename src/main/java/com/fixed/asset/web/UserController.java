package com.fixed.asset.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fixed.asset.common.Constants;
import com.fixed.asset.common.JsonMessage;
import com.fixed.asset.model.Msg;
import com.fixed.asset.model.MsgStat;
import com.fixed.asset.model.User;
import com.fixed.asset.model.UserExample;
import com.fixed.asset.service.RoleService;
import com.fixed.asset.service.UserRoleService;
import com.fixed.asset.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;


@Controller
@RequestMapping("/user")
public class UserController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
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
				keywords = keywords.trim();
				example.or().andIsDeleteEqualTo(Constants.IS_DELETE_FALSE).andUserNameLike("%"+keywords+"%");
			}else {
				example.or().andIsDeleteEqualTo(Constants.IS_DELETE_FALSE);
			}
			List<User> ulist = userService.selectByExample(example);
			if(null==ulist || ulist.size()<=0)
				ulist = new ArrayList<User>();
			model.addAttribute("users", ulist);
			model.addAttribute("keywords", keywords);
	        return "user_list";
	    }
	 	
		@RequestMapping("/ajax_get")
		@ResponseBody
	    public String ajaxGet(Model model,String keywords,
	    		@RequestParam(value = "pageNo", required = false) Integer  pageNo,
				@RequestParam(value = "pageSize", required = false) Integer  pageSize, 
				@RequestParam(value = "orderBy", required = false) String orderBy){
			System.out.println("搜索关键词："+keywords);
			Map<String, Object> data = new HashMap<>();
	        pageNo = (null == pageNo) ? Constants.PAGENO:pageNo;
	        pageSize = (null == pageSize ) ? Constants.PAGESIZE : pageSize;
	        Page page = PageHelper.startPage(pageNo, pageSize, true);
	        
			UserExample example = new UserExample();
			if(null!=keywords&&!"".equals(keywords)) {
				keywords = keywords.trim();
				example.or().andIsDeleteEqualTo(Constants.IS_DELETE_FALSE).andUserNameLike("%"+keywords+"%");
			}else {
				example.or().andIsDeleteEqualTo(Constants.IS_DELETE_FALSE);
			}
			List<User> ulist = userService.selectByExample(example);
			if(null==ulist || ulist.size()<=0)
				ulist = new ArrayList<User>();
			model.addAttribute("users", ulist);
			model.addAttribute("keywords", keywords);
	        return ;
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
	    public String save(HttpServletResponse response,Model model,User user,String [] roleIds){
	 		try {
	 			userService.save(user,roleIds);
	 			return JsonMessage.success(response);
	 		}catch(Exception e) {
	 			logger.error("用户管理：保存用户失败！", e);
	 			return JsonMessage.error(response, "保存用户失败！");
	 		}
	    }
	 	

	 	@RequestMapping(value = "/stop/{userId}",method=RequestMethod.GET)
	 	@ResponseBody
	    public String stop(HttpServletResponse response,Model model,@PathVariable("userId")String userId){
	 		if(null==userId)
	 			return new Msg(MsgStat.error,"参数错误！").toJson();
	 		try {
	 			User user = userService.findById(Integer.parseInt(userId));
	 			user.setStatus(Constants.USER_STATUS_STOP);
	 			userService.save(user);
	 			return  JsonMessage.success(response);
	 		}catch(Exception e) {
	 			logger.error("用户管理：冻结用户失败！", e);
	 			return JsonMessage.error(response, "冻结用户失败！");
	 		}
	    }
	 	
	 	@RequestMapping(value = "/active/{userId}",method=RequestMethod.GET)
	 	@ResponseBody
	    public String active(HttpServletResponse response,Model model,@PathVariable("userId")String userId){
	 		if(null==userId)
	 			return new Msg(MsgStat.error,"参数错误！").toJson();
	 		try {
	 			User user = userService.findById(Integer.parseInt(userId));
	 			user.setStatus(Constants.USER_STATUS_ACTIVE);
	 			userService.save(user);
	 			return  JsonMessage.success(response);
	 		}catch(Exception e) {
	 			logger.error("用户管理：激活用户失败！", e);
	 			return JsonMessage.error(response, "激活用户失败！");
	 		}
	    }
	 	
	 	@RequestMapping(value = "/delete",method=RequestMethod.POST)
	 	@ResponseBody
	    public String delete(HttpServletResponse response, Model model,String [] userIds){
	 		if(null==userIds || userIds.length ==0)
	 			return new Msg(MsgStat.error,"参数错误！").toJson();
	 		try {
	 			for(String userId : userIds) {
	 				//逻辑删除
		 			User user = userService.findById(Integer.parseInt(userId));
		 			user.setIsDelete(Constants.IS_DELETE_TRUE);
		 			userService.updateByPrimaryKey(user);
	 			}
	 			return JsonMessage.success(response);
	 		}catch(Exception e) {
	 			logger.error("用户管理：删除用户失败！", e);
	 			return JsonMessage.error(response, "删除用户失败！");
	 		}
	    }
}
