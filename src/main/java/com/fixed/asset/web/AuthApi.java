//package com.fixed.asset.web;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.alibaba.fastjson.JSONObject;
//import com.fixed.asset.model.User;
//import com.fixed.asset.service.UserService;
//
//import sun.security.provider.MD5;
//
//@RestController
//@RequestMapping("/auth")
//public class AuthApi {
//	 private UserService userService;
//
//	    @Autowired
//	    public AuthApi(UserService userService) {
//	        this.userService = userService;
//	    }
//
//	    @PostMapping("/login")
//	    public Object login(@RequestBody User user) {
//	    	User dbUser = userService.findByName(user.getName());
//	    	if(null!=dbUser && dbUser.getPassword().equals(user.getPassword()))
//	    		
//	        if (userService.findByName(user.getName()) != null) {
//	        	
//	            JSONObject jsonObject = new JSONObject();
//	            jsonObject.put("message","用户名已被使用");
//	            return jsonObject;
//	        }
//	        return userService.add(user);
//	    }
//}
