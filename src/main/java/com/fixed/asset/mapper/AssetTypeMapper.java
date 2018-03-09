package com.fixed.asset.mapper;

import com.fixed.asset.model.AssetType;
import com.fixed.asset.model.AssetTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetTypeMapper {
    long countByExample(AssetTypeExample example);

    int deleteByExample(AssetTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(AssetType record);

    int insertSelective(AssetType record);

    List<AssetType> selectByExample(AssetTypeExample example);

    AssetType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") AssetType record, @Param("example") AssetTypeExample example);

    int updateByExample(@Param("record") AssetType record, @Param("example") AssetTypeExample example);

    int updateByPrimaryKeySelective(AssetType record);

    int updateByPrimaryKey(AssetType record);
}