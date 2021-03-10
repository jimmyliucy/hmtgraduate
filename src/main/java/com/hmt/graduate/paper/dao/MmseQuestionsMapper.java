package com.hmt.graduate.paper.dao;

import com.hmt.graduate.paper.pojo.MmseQuestions;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MmseQuestionsMapper {

    int insert(MmseQuestions record);

    int insertSelective(MmseQuestions record);

    List<MmseQuestions> selectAllQuestions();

}