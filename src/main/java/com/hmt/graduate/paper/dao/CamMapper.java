package com.hmt.graduate.paper.dao;

import com.hmt.graduate.paper.pojo.Cam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CamMapper {

    int insert(Cam record);

    int insertSelective(Cam record);

    List<Cam> selectCamByPatientId(Integer patientId);
}