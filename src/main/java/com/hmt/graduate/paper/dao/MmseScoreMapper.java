package com.hmt.graduate.paper.dao;

import com.hmt.graduate.paper.pojo.MmseScore;
import com.lycheepay.clearing.annotation.NotNamedMapper;
import org.lychee.mybatis.annotation.ReturnRows;

@NotNamedMapper
public interface MmseScoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MmseScore record);

    int insertSelective(MmseScore record);

    MmseScore selectByPrimaryKey(Integer id);

    @ReturnRows(value=1)
    int updateByPrimaryKeySelective(MmseScore record);

    @ReturnRows(value=1)
    int updateByPrimaryKey(MmseScore record);
}