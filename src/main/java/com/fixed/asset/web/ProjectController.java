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
import com.fixed.asset.config.CustomToolsUtils;
import com.fixed.asset.model.Msg;
import com.fixed.asset.model.MsgStat;
import com.fixed.asset.model.Project;
import com.fixed.asset.model.ProjectExample;
import com.fixed.asset.service.RoleService;
import com.fixed.asset.service.ProjectService;
import com.google.gson.Gson;



/**
 * 入库管理
 * @author keen
 *
 */

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
//		@Autowired
//		ProjectService projectRoleService;
		
		@Autowired
		ProjectService projectService;
	 	
		@Autowired
		RoleService roleSevice;
		
		public static final String ControllerName="入库管理";
		public static final String ControllerCode="project_list";
		
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
			
	        ProjectExample example = new ProjectExample();
	        example.setPaged(true);
	        example.setPageStart(start);
			example.setPageSize(null == length ? Constants.PAGESIZE : length);
	        
			
			if(null!=keywords&&!"".equals(keywords)) {
				keywords = keywords.trim();
				example.or().andProjectNameLike("%"+keywords+"%");
				example.or().andProjectCodeLike("%"+keywords+"%");
				example.or().andProjectRemarkLike("%"+keywords+"%");
			}
			
			
			List<Project> ulist ;
			Long totalSize ;
			DataTablePage<Project> page = new DataTablePage<Project>();
			page.addParam("keywords", keywords);
			try {
				ulist = projectService.selectByExample(example);
				if(null!=ulist)
					page.setData(ulist);
				totalSize = projectService.countByExample(example);
				if(totalSize>0)
					page.setRecordsFiltered(totalSize);
			} catch (Exception e) {
				logger.error(ControllerName+"异常！",e);
			}
	        return new Gson().toJson(page);
	    }
		
		@RequestMapping(value = "/modify",method=RequestMethod.GET)
	    public String toAdd(Model model){
	 		model.addAttribute("roles", roleSevice.getRoles(null));
	 		Project project = new Project();
	 		model.addAttribute("project", project);
	 		return "project_modify";
	    }
		
	 	@RequestMapping(value = "/modify/{projectId}",method=RequestMethod.GET)
	    public String toModify(Model model,@PathVariable("projectId") String projectId){
	 		model.addAttribute("roles", roleSevice.getRoles(null));
	 		Project project = new Project();
	 		if(null!=projectId)
				try {
					project = projectService.selectByPrimaryKey(Integer.parseInt(projectId));
				} catch (NumberFormatException e) {
					logger.error(ControllerName+"异常！",e);
				} catch (Exception e) {
					logger.error(ControllerName+"异常！",e);
				}
	 		model.addAttribute("project", project);
	 		return "project_modify";
	    }
	 	
	 	/**
	 	 * 
	 	 * @param model
	 	 * @param project
	 	 * @param roleIds
	 	 * @return
	 	 */
	 	@RequestMapping(value = "/save",method=RequestMethod.POST)
	 	@ResponseBody
	    public String save(HttpServletResponse response,Model model,Project project){
	 		try {
	 			if(project.getProjectId()==null) {
	 				projectService.updateByPrimaryKeySelective(project);
	 			}else {
	 				projectService.insertSelective(project);
	 			}
	 			return JsonMessage.success(response,op.USER_UPDATE);
	 		}catch(Exception e) {
	 			logger.error("入库管理：保存入库单失败！", e);
	 			return JsonMessage.error(response, "保存入库单失败！");
	 		}
	    }
	 	
	 	
	 	
	 	@RequestMapping(value = "/delete",method=RequestMethod.POST)
	 	@ResponseBody
	    public String delete(HttpServletResponse response, Model model,String  projectId){
	 		if(null==projectId || "".equals(projectId.trim())) 
	 			return new Msg(MsgStat.error,"参数错误！").toJson();
	 		try {
	 			Project project = projectService.selectByPrimaryKey(Integer.parseInt(projectId));
	 			//TODO 检查入库单状态 是否是可以删除的状态（审批完成）
	 			projectService.deleteByPrimaryKeyCascade(Integer.parseInt(projectId));
	 			return JsonMessage.success(response,op.USER_DELETE);
	 		}catch(Exception e) {
	 			logger.error("入库管理：删除入库失败！", e);
	 			return JsonMessage.error(response, "删除入库失败！");
	 		}
	    }
}
