package com.fixed.asset.config;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.fixed.asset.common.Constants;
import com.fixed.asset.mapper.ResourceMapper;
import com.fixed.asset.model.Resource;
import com.fixed.asset.model.ResourceExample;

/**
 * 服务启动时初始化
 * @author xinjun.zhang
 *
 */
public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	ResourceMapper resourceMapper;
	
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    	//菜单初始化
    	ResourceExample folderExample = new ResourceExample();
    	folderExample.or().andResourceTypeEqualTo(Constants.RESOURCE_TYPE_MENU_FOLDER);
    	Constants.menuFolders = resourceMapper.selectByExample(folderExample);
    	ResourceExample menuExample = new ResourceExample();
    	folderExample.or().andResourceTypeEqualTo(Constants.RESOURCE_TYPE_MENU_URL);
    	Constants.menuUrls = resourceMapper.selectByExample(menuExample);
    }
}