package com.fixed.asset.mapper;

import com.fixed.asset.model.AssetStatus;
import com.fixed.asset.model.AssetStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetStatusMapper {
    long countByExample(AssetStatusExample example);

    int deleteByExample(AssetStatusExample example);

    int deleteByPrimaryKey(Integer statusId);

    int insert(AssetStatus record);

    int insertSelective(AssetStatus record);

    List<AssetStatus> selectByExample(AssetStatusExample example);

    AssetStatus selectByPrimaryKey(Integer statusId);

    int updateByExampleSelective(@Param("record") AssetStatus record, @Param("example") AssetStatusExample example);

    int updateByExample(@Param("record") AssetStatus record, @Param("example") AssetStatusExample example);

    int updateByPrimaryKeySelective(AssetStatus record);

    int updateByPrimaryKey(AssetStatus record);
}