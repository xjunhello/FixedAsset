package com.fixed.asset.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.fixed.asset.common.Constants;
import com.fixed.asset.mapper.ResourceMapper;

import com.fixed.asset.model.ResourceExample;

/**
 * 监听上下文变更，执行更新操作
 * @author xinjun.zhang
 *
 */
public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {
	
	
	
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    	//TODO 刷新缓存
    	//TODO 查询端口占用
    	//TODO 探测数据库连接
    }
}