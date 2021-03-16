package com.hmt.graduate.paper.dao;

import com.hmt.graduate.paper.pojo.Cam;
import com.lycheepay.clearing.annotation.NotNamedMapper;
import org.lychee.mybatis.annotation.ReturnRows;

@NotNamedMapper
public interface CamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cam record);

    int insertSelective(Cam record);

    Cam selectByPrimaryKey(Integer id);

    @ReturnRows(value=1)
    int updateByPrimaryKeySelective(Cam record);

    @ReturnRows(value=1)
    int updateByPrimaryKey(Cam record);
}