package com.fixed.asset.mapper;

import com.fixed.asset.model.ProjectDetail;
import com.fixed.asset.model.ProjectDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectDetailMapper {
    long countByExample(ProjectDetailExample example);

    int deleteByExample(ProjectDetailExample example);

    int deleteByPrimaryKey(Integer detailId);

    int insert(ProjectDetail record);

    int insertSelective(ProjectDetail record);

    List<ProjectDetail> selectByExampleWithBLOBs(ProjectDetailExample example);

    List<ProjectDetail> selectByExample(ProjectDetailExample example);

    ProjectDetail selectByPrimaryKey(Integer detailId);

    int updateByExampleSelective(@Param("record") ProjectDetail record, @Param("example") ProjectDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") ProjectDetail record, @Param("example") ProjectDetailExample example);

    int updateByExample(@Param("record") ProjectDetail record, @Param("example") ProjectDetailExample example);

    int updateByPrimaryKeySelective(ProjectDetail record);

    int updateByPrimaryKeyWithBLOBs(ProjectDetail record);

    int updateByPrimaryKey(ProjectDetail record);
}