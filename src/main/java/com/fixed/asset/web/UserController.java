package com.fixed.asset.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import com.fixed.asset.common.DataTablePage;
import com.fixed.asset.common.JsonMessage;
import com.fixed.asset.common.PageList;
import com.fixed.asset.common.op;
import com.fixed.asset.config.CustomToolsUtils;
import com.fixed.asset.model.Msg;
import com.fixed.asset.model.MsgStat;
import com.fixed.asset.model.Resource;
import com.fixed.asset.model.ResourceExample;
import com.fixed.asset.model.User;
import com.fixed.asset.model.UserExample;
import com.fixed.asset.service.ResourceService;
import com.fixed.asset.service.RoleService;
import com.fixed.asset.service.UserRoleService;
import com.fixed.asset.service.UserService;
import com.google.gson.Gson;





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
		

		public static final String ControllerName="用户管理";
		public static final String ControllerCode="user_list";
		
		/**
		 * 公共代码 start
		 */
		@Autowired
		CustomToolsUtils commonTool;
		@RequestMapping("/")
	    public String get(Model model,HttpSession session){
			commonTool.setCurrentMenu(ControllerCode, session);
	        return ControllerCode;
	    }
		/**
		 * 公共代码 end 
		 */
		
		@RequestMapping("/ajax_get")
		@ResponseBody
	    public String ajaxGet(Model model,String keywords,
	    		@RequestParam(value = "start", required = false) Integer  start,
				@RequestParam(value = "length", required = false) Integer  length, 
				@RequestParam(value = "draw", required = false) Integer  draw,
				@RequestParam(value = "search", required = false) String  search,
				@RequestParam(value = "sort", required = false) String orderBy){
			System.out.println("搜索关键词："+keywords);
			
	        UserExample example = new UserExample();
	        example.setPaged(true);
	        example.setPageStart(start);
			example.setPageSize(null == length ? Constants.PAGESIZE : length);
	        
			
			if(null!=keywords&&!"".equals(keywords)) {
				keywords = keywords.trim();
				example.or().andIsDeleteEqualTo(Constants.IS_DELETE_FALSE).andUserNameLike("%"+keywords+"%");
			}else {
				example.or().andIsDeleteEqualTo(Constants.IS_DELETE_FALSE);
			}
			
			
			List<User> ulist = userService.selectByExample(example);
			Long totalSize = userService.countByExample(example);
			if(null==ulist || ulist.size()<=0)
				ulist = new ArrayList<User>();
//			PageList<User> page = new PageList<User>(ulist, start, length,totalSize);
			DataTablePage<User> page = new DataTablePage<>(ulist, start, length, totalSize);
			if(null!=page)
				page.addParam("keywords", keywords);
			model.addAttribute("page", page);
			model.addAttribute("users", ulist);
			model.addAttribute("keywords", keywords);
	        return new Gson().toJson(page);
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
	 			return JsonMessage.success(response,op.USER_UPDATE);
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
	 			userService.updateByPrimaryKey(user);
	 			return  JsonMessage.success(response,op.USER_STOP);
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
	 			userService.updateByPrimaryKey(user);
	 			return  JsonMessage.success(response,op.USER_ACTIVE);
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
	 			return JsonMessage.success(response,op.USER_DELETE);
	 		}catch(Exception e) {
	 			logger.error("用户管理：删除用户失败！", e);
	 			return JsonMessage.error(response, "删除用户失败！");
	 		}
	    }
}
