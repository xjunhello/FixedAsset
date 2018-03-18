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

import com.fixed.asset.service.CustomUserDetailService;

@Controller
public class HomeController {
	
//	@Autowired
//    SessionRegistry sessionRegistry;
//	
	@Autowired
	private CustomUserDetailService service;

	@RequestMapping("/home")
	public String index(Model model, HttpSession session) {
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