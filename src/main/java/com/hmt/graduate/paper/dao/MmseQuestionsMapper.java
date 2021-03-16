package com.hmt.graduate.paper.dao;

import com.hmt.graduate.paper.pojo.MmseQuestions;
import com.lycheepay.clearing.annotation.NotNamedMapper;
import org.lychee.mybatis.annotation.ReturnRows;

@NotNamedMapper
public interface MmseQuestionsMapper {
    int deleteByPrimaryKey(Integer questionId);

    int insert(MmseQuestions record);

    int insertSelective(MmseQuestions record);

    MmseQuestions selectByPrimaryKey(Integer questionId);

    int updateByPrimaryKeySelective(MmseQuestions record);

    int updateByPrimaryKey(MmseQuestions record);
}