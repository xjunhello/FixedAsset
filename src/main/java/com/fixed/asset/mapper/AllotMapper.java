package com.fixed.asset.mapper;

import com.fixed.asset.model.Allot;
import com.fixed.asset.model.AllotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AllotMapper {
    long countByExample(AllotExample example);

    int deleteByExample(AllotExample example);

    int deleteByPrimaryKey(Integer allotId);

    int insert(Allot record);

    int insertSelective(Allot record);

    List<Allot> selectByExample(AllotExample example);

    Allot selectByPrimaryKey(Integer allotId);

    int updateByExampleSelective(@Param("record") Allot record, @Param("example") AllotExample example);

    int updateByExample(@Param("record") Allot record, @Param("example") AllotExample example);

    int updateByPrimaryKeySelective(Allot record);

    int updateByPrimaryKey(Allot record);
}