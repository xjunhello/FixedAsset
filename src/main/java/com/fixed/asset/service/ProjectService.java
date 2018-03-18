package com.fixed.asset.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fixed.asset.mapper.ProjectMapper;
import com.fixed.asset.model.Project;
import com.fixed.asset.model.ProjectExample;

@Service("projectService")
public class ProjectService {
	@Autowired
	private ProjectMapper projectMapper;
    
	
	public List<Project> getProjects(ProjectExample example){
		return projectMapper.selectByExample(example);
	}
	
	public long countByExample(ProjectExample example) throws Exception{
		return projectMapper.countByExample(example);
	}

	public int deleteByExample(ProjectExample example) throws Exception{
		return projectMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer roleId) throws Exception{
		return projectMapper.deleteByPrimaryKey(roleId);
	}

	public int insert(Project record) throws Exception{
		return projectMapper.insert(record);
	}

	public int insertSelective(Project record) throws Exception{
		return projectMapper.insertSelective(record);
	}

	public List<Project> selectByExample(ProjectExample example) throws Exception{
		return projectMapper.selectByExample(example);
	}

	public Project selectByPrimaryKey(Integer roleId) throws Exception{
		return projectMapper.selectByPrimaryKey(roleId);
	}

	public int updateByExampleSelective(@Param("record") Project record,
			@Param("example") ProjectExample example) throws Exception{
		return projectMapper.updateByExample(record, example);
	}

	public int updateByExample(@Param("record") Project record,
			@Param("example") ProjectExample example) throws Exception{
		return projectMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Project record) throws Exception{
		return projectMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Project record) throws Exception{
		return projectMapper.updateByPrimaryKey(record);
	}
	/**
	 * 级联删除入库单和关联的对象
	 * @param parseInt
	 */
	public void deleteByPrimaryKeyCascade(int parseInt) {
		// TODO  入库单，detail，
		
	}
}
