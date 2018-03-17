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
import com.fixed.asset.common.DataTablePage;
import com.fixed.asset.common.JsonMessage;
import com.fixed.asset.common.PageList;
import com.fixed.asset.common.op;
import com.fixed.asset.model.Msg;
import com.fixed.asset.model.MsgStat;
import com.fixed.asset.model.Role;
import com.fixed.asset.model.RoleExample;
import com.fixed.asset.service.RoleService;
import com.fixed.asset.service.RoleRoleService;
import com.fixed.asset.service.RoleService;
import com.google.gson.Gson;




/**
 * 
 * @author xinjun.zhang
 *
 */
@Controller
@RequestMapping("/role")
public class RoleController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
//		@Autowired
//		RoleRoleService roleRoleService;
		
		@Autowired
		RoleService roleService;
	 	
		@Autowired
		RoleService roleSevice;
		
		public static final String ControllerName="角色管理";
	 	
		@RequestMapping("/get")
		@ResponseBody
	    public String ajaxGet(Model model,String keywords,
	    		@RequestParam(value = "start", required = false) Integer  start,
				@RequestParam(value = "length", required = false) Integer  length, 
				@RequestParam(value = "draw", required = false) Integer  draw,
				@RequestParam(value = "search", required = false) String  search,
				@RequestParam(value = "sort", required = false) String orderBy){
			System.out.println("搜索关键词："+keywords);
			Map<String, Object> data = new HashMap<>();
			
	        RoleExample example = new RoleExample();
	        example.setPaged(true);
	        example.setPageStart(start);
			example.setPageSize(null == length ? Constants.PAGESIZE : length);
	        
			
			if(null!=keywords&&!"".equals(keywords)) {
				keywords = keywords.trim();
				example.or().andRoleNameLike("%"+keywords+"%");
				example.or().andRemarkLike("%"+keywords+"%");
			}
	
			List<Role> ulist ;
			Long totalSize ;
			DataTablePage<Role> page = new DataTablePage<>();
			try {
				ulist = roleService.selectByExample(example);
				totalSize = roleService.countByExample(example);
			} catch (Exception e) {
				logger.error(ControllerName+"异常！",e);
			}
			
			DataTablePage<Role> page = new DataTablePage<>(ulist, start, length, totalSize);
			if(null!=page)
				page.addParam("keywords", keywords);
			model.addAttribute("page", page);
			return new Gson().toJson(page);
	    }
		
		@RequestMapping(value = "/modify",method=RequestMethod.GET)
	    public String toAdd(Model model){
	 		model.addAttribute("roles", roleSevice.getRoles(null));
	 		Role role = new Role();
	 		model.addAttribute("role", role);
	 		return "role_modify";
	    }
		
	 	@RequestMapping(value = "/modify/{roleId}",method=RequestMethod.GET)
	    public String toModify(Model model,@PathVariable("roleId") String roleId){
	 		model.addAttribute("roles", roleSevice.getRoles(null));
	 		
	 		Role role = new Role();
	 		if(null!=roleId)
	 			role = roleService.findById(Integer.parseInt(roleId));
	 		model.addAttribute("role", role);
	 		model.addAttribute("roleRoles", role.getRoles());
	 		return "role_modify";
	    }
	 	
	 	/**
	 	 * 
	 	 * @param model
	 	 * @param role
	 	 * @param roleIds
	 	 * @return
	 	 */
	 	@RequestMapping(value = "/save",method=RequestMethod.POST)
	 	@ResponseBody
	    public String save(HttpServletResponse response,Model model,Role role,String [] roleIds){
	 		try {
	 			roleService.save(role,roleIds);
	 			return JsonMessage.success(response,op.USER_UPDATE);
	 		}catch(Exception e) {
	 			logger.error("用户管理：保存用户失败！", e);
	 			return JsonMessage.error(response, "保存用户失败！");
	 		}
	    }
	 	

	 	@RequestMapping(value = "/stop/{roleId}",method=RequestMethod.GET)
	 	@ResponseBody
	    public String stop(HttpServletResponse response,Model model,@PathVariable("roleId")String roleId){
	 		if(null==roleId)
	 			return new Msg(MsgStat.error,"参数错误！").toJson();
	 		try {
	 			Role role = roleService.findById(Integer.parseInt(roleId));
	 			role.setStatus(Constants.USER_STATUS_STOP);
	 			roleService.updateByPrimaryKey(role);
	 			return  JsonMessage.success(response,op.USER_STOP);
	 		}catch(Exception e) {
	 			logger.error("用户管理：冻结用户失败！", e);
	 			return JsonMessage.error(response, "冻结用户失败！");
	 		}
	    }
	 	
	 	@RequestMapping(value = "/active/{roleId}",method=RequestMethod.GET)
	 	@ResponseBody
	    public String active(HttpServletResponse response,Model model,@PathVariable("roleId")String roleId){
	 		if(null==roleId)
	 			return new Msg(MsgStat.error,"参数错误！").toJson();
	 		try {
	 			Role role = roleService.findById(Integer.parseInt(roleId));
	 			role.setStatus(Constants.USER_STATUS_ACTIVE);
	 			roleService.updateByPrimaryKey(role);
	 			return  JsonMessage.success(response,op.USER_ACTIVE);
	 		}catch(Exception e) {
	 			logger.error("用户管理：激活用户失败！", e);
	 			return JsonMessage.error(response, "激活用户失败！");
	 		}
	    }
	 	
	 	@RequestMapping(value = "/delete",method=RequestMethod.POST)
	 	@ResponseBody
	    public String delete(HttpServletResponse response, Model model,String [] roleIds){
	 		if(null==roleIds || roleIds.length ==0)
	 			return new Msg(MsgStat.error,"参数错误！").toJson();
	 		try {
	 			for(String roleId : roleIds) {
	 				//逻辑删除
		 			Role role = roleService.findById(Integer.parseInt(roleId));
		 			role.setIsDelete(Constants.IS_DELETE_TRUE);
		 			roleService.updateByPrimaryKey(role);
	 			}
	 			return JsonMessage.success(response,op.USER_DELETE);
	 		}catch(Exception e) {
	 			logger.error("用户管理：删除用户失败！", e);
	 			return JsonMessage.error(response, "删除用户失败！");
	 		}
	    }
}
