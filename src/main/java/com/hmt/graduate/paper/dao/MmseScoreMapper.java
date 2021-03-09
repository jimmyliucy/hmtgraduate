package com.hmt.graduate.paper.dao;

import com.hmt.graduate.paper.pojo.MmseScore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MmseScoreMapper {
    
    int insert(MmseScore record);

    int insertSelective(MmseScore record);

    List<MmseScore> selectMmseByPatientId(Integer patientId);

}