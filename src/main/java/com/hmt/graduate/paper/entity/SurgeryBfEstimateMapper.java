package com.hmt.graduate.paper.entity;

import com.hmt.graduate.paper.pojo.SurgeryBfEstimate;
import com.lycheepay.clearing.annotation.NotNamedMapper;
import org.lychee.mybatis.annotation.ReturnRows;

@NotNamedMapper
public interface SurgeryBfEstimateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SurgeryBfEstimate record);

    int insertSelective(SurgeryBfEstimate record);

    SurgeryBfEstimate selectByPrimaryKey(Long id);

    @ReturnRows(value=1)
    int updateByPrimaryKeySelective(SurgeryBfEstimate record);

    @ReturnRows(value=1)
    int updateByPrimaryKey(SurgeryBfEstimate record);
}