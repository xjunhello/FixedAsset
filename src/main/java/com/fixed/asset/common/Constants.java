package com.fixed.asset.common;

import java.util.List;

import com.fixed.asset.model.Resource;

public class Constants {
	//当前菜单
	public static final String CURRENT_MENU_KEY="current_menu";
	//菜单
	public static List<Resource> menuFolders;
	public static List<Resource> menuUrls;
	public static final Integer RESOURCE_TYPE_MENU_FOLDER=1; //一级菜单
	public static final Integer RESOURCE_TYPE_MENU_URL=2; //二级菜单
	public static final Integer RESOURCE_TYPE_OTHER=3; //二级菜单
	//用户状态
 	public static final Integer USER_STATUS_STOP=1; //冻结
 	public static final Integer USER_STATUS_ACTIVE=0;//激活
 	//是否删除
 	public static final Integer IS_DELETE_TRUE=1;//已删除
 	public static final Integer IS_DELETE_FALSE=0;//未删除
 	
 	/**
	 * 默认分页参数
	 */
 	public static final int PAGESTART=0;
 	public static final int PAGENO=1;
	public static final int PAGESIZE=10;
	public static final long TOTALSIZE=0;
}
