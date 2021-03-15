package com.hmt.graduate.paper.dao;

import com.hmt.graduate.paper.pojo.SurgeryingEstimate;
import com.hmt.graduate.paper.annotation.NotNamedMapper;

@NotNamedMapper
public interface SurgeryingEstimateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SurgeryingEstimate record);

    int insertSelective(SurgeryingEstimate record);

    SurgeryingEstimate selectByPrimaryKey(Long id);

    //@ReturnRows(value=1)
    int updateByPrimaryKeySelective(SurgeryingEstimate record);

    //@ReturnRows(value=1)
    int updateByPrimaryKey(SurgeryingEstimate record);
}