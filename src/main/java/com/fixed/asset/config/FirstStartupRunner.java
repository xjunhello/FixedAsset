package com.fixed.asset.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.fixed.asset.common.Constants;
import com.fixed.asset.mapper.ResourceMapper;
import com.fixed.asset.model.ResourceExample;
/**
 * 服务初始化
 * @author xinjun.zhang
 *
 */
@Component
@Order(value=1)
public class FirstStartupRunner implements CommandLineRunner {
	@Autowired
	ResourceMapper resourceMapper;
	@Override
	public void run(String... arg0) throws Exception {
		//菜单初始化
    	ResourceExample folderExample = new ResourceExample();
    	folderExample.or().andResourceTypeEqualTo(Constants.RESOURCE_TYPE_MENU_FOLDER);
    	folderExample.setOrderByClause("order_no asc");
    	Constants.menuFolders = resourceMapper.selectByExample(folderExample);
    	ResourceExample menuExample = new ResourceExample();
    	menuExample.or().andResourceTypeEqualTo(Constants.RESOURCE_TYPE_MENU_URL);
    	menuExample.setOrderByClause("order_no asc");
    	Constants.menuUrls = resourceMapper.selectByExample(menuExample);
    	System.out.println("菜单初始化：一级菜单："+Constants.menuFolders.size()+"，二级菜单："+Constants.menuUrls.size());

	}

}
