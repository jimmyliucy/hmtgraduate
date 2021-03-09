package com.hmt.graduate.paper.service.patients;

import com.hmt.graduate.paper.pojo.MmseQuestions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MmseQuestionService {

    int insert(MmseQuestions record);

    int insertSelective(MmseQuestions record);

    List<MmseQuestions> selectAllQuestions();

}
