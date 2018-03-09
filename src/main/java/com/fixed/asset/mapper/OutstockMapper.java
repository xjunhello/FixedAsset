package com.fixed.asset.mapper;

import com.fixed.asset.model.Outstock;
import com.fixed.asset.model.OutstockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutstockMapper {
    long countByExample(OutstockExample example);

    int deleteByExample(OutstockExample example);

    int deleteByPrimaryKey(Integer outstockId);

    int insert(Outstock record);

    int insertSelective(Outstock record);

    List<Outstock> selectByExampleWithBLOBs(OutstockExample example);

    List<Outstock> selectByExample(OutstockExample example);

    Outstock selectByPrimaryKey(Integer outstockId);

    int updateByExampleSelective(@Param("record") Outstock record, @Param("example") OutstockExample example);

    int updateByExampleWithBLOBs(@Param("record") Outstock record, @Param("example") OutstockExample example);

    int updateByExample(@Param("record") Outstock record, @Param("example") OutstockExample example);

    int updateByPrimaryKeySelective(Outstock record);

    int updateByPrimaryKeyWithBLOBs(Outstock record);

    int updateByPrimaryKey(Outstock record);
}