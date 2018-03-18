package com.fixed.asset.config;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fixed.asset.common.Constants;
import com.fixed.asset.model.Resource;
import com.fixed.asset.model.ResourceExample;
import com.fixed.asset.service.ResourceService;

@Service("commonTool")
public class CustomToolsUtils {
	@Autowired
	ResourceService resourceService;
	/**
	 * 设置菜单高亮
	 * @param currentControllerName
	 * @param session
	 */
	public void setCurrentMenu(String currentControllerName,HttpSession session) {
		ResourceExample re = new ResourceExample();
		re.or().andResourceNameEqualTo(currentControllerName);
		List<Resource> list1;
		List<Resource> list2;
		try {
			list1 = resourceService.selectByExample(re);
			if(null!=list1&&list1.size()==1)
				session.setAttribute(Constants.CURRENT_MENU_KEY, list1.get(0));
			re = new ResourceExample();
			re.or().andResourceIdEqualTo(list1.get(0).getParentId());
			list2 = resourceService.selectByExample(re);
			if(null!=list2&&list2.size()==1)
				session.setAttribute(Constants.CURRENT_FOLDER_KEY, list2.get(0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
