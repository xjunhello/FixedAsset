package com.fixed.asset.service;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fixed.asset.mapper.ResourceMapper;
//import com.fixed.asset.mapper.RoleResourceMapper;
import com.fixed.asset.model.Resource;
import com.fixed.asset.model.ResourceExample;


@Service("resourceService")
public class ResourceService {
	
	@Autowired
	private ResourceMapper resourceMapper;
    
//	@Autowired
//    private RoleResourceMapper rrMapper;
	
	public List<Resource> getResources(ResourceExample example){
		return resourceMapper.selectByExample(example);
	}
	
	public long countByExample(ResourceExample example) throws Exception{
		return resourceMapper.countByExample(example);
	}

	public int deleteByExample(ResourceExample example) throws Exception{
		return resourceMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer roleId) throws Exception{
		return resourceMapper.deleteByPrimaryKey(roleId);
	}

	public int insert(Resource record) throws Exception{
		return resourceMapper.insert(record);
	}

	public int insertSelective(Resource record) throws Exception{
		return resourceMapper.insertSelective(record);
	}

	public List<Resource> selectByExample(ResourceExample example) throws Exception{
		return resourceMapper.selectByExample(example);
	}

	public Resource selectByPrimaryKey(Integer roleId) throws Exception{
		return resourceMapper.selectByPrimaryKey(roleId);
	}

	public int updateByExampleSelective(@Param("record") Resource record,
			@Param("example") ResourceExample example) throws Exception{
		return resourceMapper.updateByExample(record, example);
	}

	public int updateByExample(@Param("record") Resource record,
			@Param("example") ResourceExample example) throws Exception{
		return resourceMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Resource record) throws Exception{
		return resourceMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Resource record) throws Exception{
		return resourceMapper.updateByPrimaryKey(record);
	}
}
