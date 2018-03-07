package com.fixed.asset.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fixed.asset.model.Msg;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String index(Model model){
        Msg msg =  new Msg("测试标题","测试内容1111111111111111111","额外信息11111111111111111111111，只对管理员显示");
        model.addAttribute("msg", msg);
        return "home";
    }
    
    @RequestMapping("/page/${pageName}")
    public String mirror(Model model,@PathVariable("pageName") String pageName){
        return pageName;
    }
    
 

}