package com.fixed.asset.mapper;

import com.fixed.asset.model.UseEntry;
import com.fixed.asset.model.UseEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UseEntryMapper {
    long countByExample(UseEntryExample example);

    int deleteByExample(UseEntryExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(UseEntry record);

    int insertSelective(UseEntry record);

    List<UseEntry> selectByExample(UseEntryExample example);

    UseEntry selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") UseEntry record, @Param("example") UseEntryExample example);

    int updateByExample(@Param("record") UseEntry record, @Param("example") UseEntryExample example);

    int updateByPrimaryKeySelective(UseEntry record);

    int updateByPrimaryKey(UseEntry record);
}