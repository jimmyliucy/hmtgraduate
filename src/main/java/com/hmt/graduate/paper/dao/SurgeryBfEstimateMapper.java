package com.hmt.graduate.paper.dao;

import com.hmt.graduate.paper.pojo.SurgeryBfEstimate;
import com.hmt.graduate.paper.annotation.NotNamedMapper;

@NotNamedMapper
public interface SurgeryBfEstimateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SurgeryBfEstimate record);

    int insertSelective(SurgeryBfEstimate record);

    SurgeryBfEstimate selectByPrimaryKey(Long id);

    //@ReturnRows(value=1)
    int updateByPrimaryKeySelective(SurgeryBfEstimate record);

    //@ReturnRows(value=1)
    int updateByPrimaryKey(SurgeryBfEstimate record);
}