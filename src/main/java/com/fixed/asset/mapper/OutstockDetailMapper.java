package com.fixed.asset.mapper;

import com.fixed.asset.model.OutstockDetailExample;
import com.fixed.asset.model.OutstockDetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutstockDetailMapper {
    long countByExample(OutstockDetailExample example);

    int deleteByExample(OutstockDetailExample example);

    int deleteByPrimaryKey(OutstockDetailKey key);

    int insert(OutstockDetailKey record);

    int insertSelective(OutstockDetailKey record);

    List<OutstockDetailKey> selectByExample(OutstockDetailExample example);

    int updateByExampleSelective(@Param("record") OutstockDetailKey record, @Param("example") OutstockDetailExample example);

    int updateByExample(@Param("record") OutstockDetailKey record, @Param("example") OutstockDetailExample example);
}