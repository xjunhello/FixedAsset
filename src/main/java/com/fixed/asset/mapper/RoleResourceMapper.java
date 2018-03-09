package com.fixed.asset.mapper;

import com.fixed.asset.model.RoleResourceExample;
import com.fixed.asset.model.RoleResourceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleResourceMapper {
    long countByExample(RoleResourceExample example);

    int deleteByExample(RoleResourceExample example);

    int deleteByPrimaryKey(RoleResourceKey key);

    int insert(RoleResourceKey record);

    int insertSelective(RoleResourceKey record);

    List<RoleResourceKey> selectByExample(RoleResourceExample example);

    int updateByExampleSelective(@Param("record") RoleResourceKey record, @Param("example") RoleResourceExample example);

    int updateByExample(@Param("record") RoleResourceKey record, @Param("example") RoleResourceExample example);
}