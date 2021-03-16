package com.hmt.graduate.paper.dao;

import com.hmt.graduate.paper.pojo.Patient;
import com.lycheepay.clearing.annotation.NotNamedMapper;
import org.lychee.mybatis.annotation.ReturnRows;

@NotNamedMapper
public interface PatientMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);
}