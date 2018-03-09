package com.fixed.asset.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fixed.asset.model.Msg;

@Controller
@RequestMapping("/user")
public class UserController {
	 	@RequestMapping("/get")
	    public String get(Model model){
	        return "user_list";
	    }
	 	
	 	@RequestMapping("/add")
	    public String add(Model model){
	        return "user_modify";
	    }
}
