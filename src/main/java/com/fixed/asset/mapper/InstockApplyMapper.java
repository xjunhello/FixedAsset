package com.fixed.asset.mapper;

import com.fixed.asset.model.InstockApply;
import com.fixed.asset.model.InstockApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstockApplyMapper {
    long countByExample(InstockApplyExample example);

    int deleteByExample(InstockApplyExample example);

    int deleteByPrimaryKey(Integer instockId);

    int insert(InstockApply record);

    int insertSelective(InstockApply record);

    List<InstockApply> selectByExample(InstockApplyExample example);

    InstockApply selectByPrimaryKey(Integer instockId);

    int updateByExampleSelective(@Param("record") InstockApply record, @Param("example") InstockApplyExample example);

    int updateByExample(@Param("record") InstockApply record, @Param("example") InstockApplyExample example);

    int updateByPrimaryKeySelective(InstockApply record);

    int updateByPrimaryKey(InstockApply record);
}