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
import com.fixed.asset.common.op;
import com.fixed.asset.model.Msg;
import com.fixed.asset.model.MsgStat;
import com.fixed.asset.model.Resource;
import com.fixed.asset.model.ResourceExample;
import com.fixed.asset.service.ResourceService;
import com.google.gson.Gson;




/**
 * 
 * @author xinjun.zhang
 *
 */
@Controller
@RequestMapping("/resource")
public class ResourceController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
//		@Autowired
//		ResourceResourceService resourceResourceService;
		
		@Autowired
		ResourceService resourceService;
	 	
		@Autowired
		ResourceService resourceSevice;
		
		public static final String ControllerName="资源管理";
		@RequestMapping("/")
	    public String get(Model model){
	        return "resource_list";
	    }
		
		@RequestMapping("/get")
		@ResponseBody
	    public String ajaxGet(Model model,String keywords,
	    		@RequestParam(value = "start", required = false) Integer  start,
				@RequestParam(value = "length", required = false) Integer  length, 
				@RequestParam(value = "draw", required = false) Integer  draw,
				@RequestParam(value = "search", required = false) String  search,
				@RequestParam(value = "sort", required = false) String orderBy){
			System.out.println("搜索关键词："+keywords);
			
	        ResourceExample example = new ResourceExample();
	        example.setOrderByClause("resource_type asc,order_no asc");
	        example.setPaged(true);
	        example.setPageStart(start);
			example.setPageSize(null == length ? Constants.PAGESIZE : length);
	        
			
			if(null!=keywords&&!"".equals(keywords)) {
				keywords = keywords.trim();
				example.or().andResourceNameLike("%"+keywords+"%");
				example.or().andRemarkLike("%"+keywords+"%");
			}
	
			List<Resource> ulist ;
			Long totalSize ;
			DataTablePage<Resource> page = new DataTablePage<Resource>();
			page.addParam("keywords", keywords);
			try {
				ulist = resourceService.selectByExample(example);
				if(null!=ulist)
					page.setData(ulist);
				totalSize = resourceService.countByExample(example);
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
	 		model.addAttribute("resources", resourceSevice.getResources(null));
	 		Resource resource = new Resource();
	 		model.addAttribute("resource", resource);
	 		return "resource_modify";
	    }
		
	 	@RequestMapping(value = "/modify/{resourceId}",method=RequestMethod.GET)
	    public String toModify(Model model,@PathVariable("resourceId") String resourceId){
	 		model.addAttribute("resources", resourceSevice.getResources(null));
	 		Resource resource = new Resource();
	 		if(null!=resourceId)
				try {
					resource = resourceService.selectByPrimaryKey(Integer.parseInt(resourceId));
				}  catch (Exception e) {
					logger.error(ControllerName, "系统异常。",e);
				}
	 		model.addAttribute("resource", resource);
	 		return "resource_modify";
	    }
	 	
	 	/**
	 	 * 
	 	 * @param model
	 	 * @param resource
	 	 * @param resourceIds
	 	 * @return
	 	 */
	 	@RequestMapping(value = "/save",method=RequestMethod.POST)
	 	@ResponseBody
	    public String save(HttpServletResponse response,Model model,Resource resource){
	 		try {
	 			if(null == resource.getResourceId()) {
	 				resourceService.insertSelective(resource);
	 			}else {
	 				resourceService.updateByPrimaryKeySelective(resource);
	 			}
	 			return JsonMessage.success(response,op.ROLE_UPDATE);
	 		}catch(Exception e) {
	 			logger.error("资源管理：保存资源失败！", e);
	 			return JsonMessage.error(response, ControllerName);
	 		}
	    }
	 	

	 	
	 	
	 	@RequestMapping(value = "/delete",method=RequestMethod.POST)
	 	@ResponseBody
	    public String delete(HttpServletResponse response, Model model,String [] resourceIds){
	 		if(null==resourceIds || resourceIds.length ==0)
	 			return new Msg(MsgStat.error,"参数错误！").toJson();
	 		try {
	 			for(String resourceId : resourceIds) {
	 				resourceService.deleteByPrimaryKey(Integer.parseInt(resourceId));
	 			}
	 			return JsonMessage.success(response,op.ROLE_DELETE);
	 		}catch(Exception e) {
	 			logger.error(ControllerName, "系统异常。"+e);
	 			return JsonMessage.error(response, ControllerName);
	 		}
	    }
}
