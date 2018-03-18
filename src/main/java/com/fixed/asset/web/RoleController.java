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
import com.fixed.asset.common.op;
import com.fixed.asset.model.Msg;
import com.fixed.asset.model.MsgStat;
import com.fixed.asset.model.Role;
import com.fixed.asset.model.RoleExample;
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
		
		/**
		 * 公共代码 start
		 */
		public static final String ControllerName="角色管理";
		public static final String ControllerCode="role_list";
		@RequestMapping("/")
	    public String get(Model model,HttpSession session){
			session.setAttribute(Constants.CURRENT_MENU_KEY, ControllerCode);
	        return "role_list";
	    }
		/**
		 * 公共代码 end 
		 */
		
		
		@RequestMapping("/get")
		@ResponseBody
	    public String ajaxGet(Model model,String keywords,
	    		@RequestParam(value = "start", required = false) Integer  start,
				@RequestParam(value = "length", required = false) Integer  length, 
				@RequestParam(value = "draw", required = false) Integer  draw,
				@RequestParam(value = "search", required = false) String  search,
				@RequestParam(value = "sort", required = false) String orderBy){
			System.out.println("搜索关键词："+keywords);
			
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
			DataTablePage<Role> page = new DataTablePage<Role>();
			page.addParam("keywords", keywords);
			try {
				ulist = roleService.selectByExample(example);
				if(null!=ulist)
					page.setData(ulist);
				totalSize = roleService.countByExample(example);
				if(totalSize>0)
					page.setRecordsFiltered(totalSize);
			} catch (Exception e) {
				logger.error(ControllerName+"异常！",e);
				
			}

			model.addAttribute("page", page);
			return new Gson().toJson(page);
	    }
		
		@RequestMapping(value = "/modify",method=RequestMethod.GET)
	    public String toAdd(Model model){
	 		model.addAttribute("roles", roleSevice.getRoles(null));
	 		Role role = new Role();
	 		model.addAttribute("role", role);

	 		model.addAttribute("menuFolders",Constants.menuFolders);
	 		model.addAttribute("menuUrls", Constants.menuUrls);
	 		return "role_modify";
	    }
		
	 	@RequestMapping(value = "/modify/{roleId}",method=RequestMethod.GET)
	    public String toModify(Model model,@PathVariable("roleId") String roleId){
	 		model.addAttribute("roles", roleSevice.getRoles(null));
	 		Role role = new Role();
	 		if(null!=roleId)
				try {
					role = roleService.selectByPrimaryKey(Integer.parseInt(roleId));
				}  catch (Exception e) {
					logger.error(ControllerName, "系统异常。",e);
				}
	 		model.addAttribute("role", role);
	 		model.addAttribute("menuFolders",Constants.menuFolders);
	 		model.addAttribute("menuUrls", Constants.menuUrls);
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
	    public String save(HttpServletResponse response,Model model,Role role,String [] resourceIds){
	 		try {
	 			roleService.save(role,resourceIds);
	 			return JsonMessage.success(response,op.ROLE_UPDATE);
	 		}catch(Exception e) {
	 			logger.error("角色管理：保存角色失败！", e);
	 			return JsonMessage.error(response, ControllerName);
	 		}
	    }
	 	

	 	
	 	
	 	@RequestMapping(value = "/delete",method=RequestMethod.POST)
	 	@ResponseBody
	    public String delete(HttpServletResponse response, Model model,String [] roleIds){
	 		if(null==roleIds || roleIds.length ==0)
	 			return new Msg(MsgStat.error,"参数错误！").toJson();
	 		try {
	 			for(String roleId : roleIds) {
	 				roleService.deleteByPrimaryKey(Integer.parseInt(roleId));
	 			}
	 			return JsonMessage.success(response,op.ROLE_DELETE);
	 		}catch(Exception e) {
	 			logger.error(ControllerName, "系统异常。"+e);
	 			return JsonMessage.error(response, ControllerName);
	 		}
	    }
}
