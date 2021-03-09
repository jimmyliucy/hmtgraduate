package com.hmt.graduate.paper.service.patients;

import com.hmt.graduate.paper.dao.MmseQuestionsMapper;
import com.hmt.graduate.paper.pojo.MmseQuestions;
import com.hmt.graduate.paper.service.AuthServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MmseQuestionServiceImpl implements MmseQuestionService {
    private static final Logger logger = LoggerFactory
            .getLogger(AuthServiceImpl.class);

    @Autowired
    private MmseQuestionsMapper mmseQuestionsMapper;

    @Override
    public int insert(MmseQuestions record) {
        return mmseQuestionsMapper.insert(record);
    }

    @Override
    public int insertSelective(MmseQuestions record) {
        return mmseQuestionsMapper.insertSelective(record);
    }

    @Override
    public List<MmseQuestions> selectAllQuestions() {
        return mmseQuestionsMapper.selectAllQuestions();
    }

}