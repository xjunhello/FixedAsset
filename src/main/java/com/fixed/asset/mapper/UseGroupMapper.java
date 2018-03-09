package com.fixed.asset.mapper;

import com.fixed.asset.model.UseGroup;
import com.fixed.asset.model.UseGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UseGroupMapper {
    long countByExample(UseGroupExample example);

    int deleteByExample(UseGroupExample example);

    int deleteByPrimaryKey(Integer groupId);

    int insert(UseGroup record);

    int insertSelective(UseGroup record);

    List<UseGroup> selectByExample(UseGroupExample example);

    UseGroup selectByPrimaryKey(Integer groupId);

    int updateByExampleSelective(@Param("record") UseGroup record, @Param("example") UseGroupExample example);

    int updateByExample(@Param("record") UseGroup record, @Param("example") UseGroupExample example);

    int updateByPrimaryKeySelective(UseGroup record);

    int updateByPrimaryKey(UseGroup record);
}