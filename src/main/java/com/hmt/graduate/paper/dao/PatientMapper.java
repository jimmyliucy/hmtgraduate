package com.hmt.graduate.paper.dao;

import com.hmt.graduate.paper.entity.PatientDTO;
import com.hmt.graduate.paper.pojo.Patient;
import com.hmt.graduate.paper.utils.PageDataResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PatientMapper {
    
    int insert(Patient record);

    int insertSelective(Patient record);

    List<Patient> selectAllPatients();

    List<Patient> selectByParam(Patient record);

    int update (Patient record);

    int delPatient(int id);

    Patient findById(int id);

}