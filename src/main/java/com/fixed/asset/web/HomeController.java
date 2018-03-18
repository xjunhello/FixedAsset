package com.fixed.asset.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fixed.asset.common.Constants;
import com.fixed.asset.model.Resource;
import com.fixed.asset.model.ResourceExample;
import com.fixed.asset.service.CustomUserDetailService;
import com.fixed.asset.service.ResourceService;

@Controller
public class HomeController {
	
//	@Autowired
//    SessionRegistry sessionRegistry;
//	
//	@Autowired
//	private CustomUserDetailService service;

	/**
	 * 公共代码 start
	 */
	@Autowired
	ResourceService resourceService;
	public static final String ControllerName="首页";
	public static final String ControllerCode="home";
	/**
	 * 公共代码 end 
	 */
	
	@RequestMapping("/home")
	public String index(Model model, HttpSession session) {
		//TODO 需要改为登录时按照权限获取
		session.setAttribute("menuFolders", Constants.menuFolders);
		session.setAttribute("menuUrls", Constants.menuUrls);
		Resource r = new Resource();
		r.setResourceName(ControllerCode);
		r.setRemark("首页");
		r.setOrderNo(0);
		session.setAttribute(Constants.CURRENT_MENU_KEY, r);
		session.setAttribute(Constants.CURRENT_FOLDER_KEY, r);
		return "home";
	}

//	@RequestMapping("/logout")
//	public void logout(Model model, HttpSession session) {
//		UserDetails user = service.loadUserByUsername("admin");
//		List<SessionInformation> allSessions = sessionRegistry.getAllSessions(user, false);
//		if (allSessions != null) {
//			for (int i = 0; i < allSessions.size(); i++) {
//				SessionInformation sessionInformation = allSessions.get(i);
//				sessionInformation.getSessionId();
//				sessionInformation.expireNow();
//			}
//		}
//	}


}