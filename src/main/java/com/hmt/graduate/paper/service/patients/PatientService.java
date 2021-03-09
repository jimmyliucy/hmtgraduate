package com.hmt.graduate.paper.service.patients;

import com.hmt.graduate.paper.entity.PatientDTO;
import com.hmt.graduate.paper.entity.UserSearchDTO;
import com.hmt.graduate.paper.pojo.Patient;
import com.hmt.graduate.paper.utils.PageDataResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PatientService {

    int insert(Patient record);

    int insertSelective(Patient record);

    List<Patient> selectAllPatients();

    int update (Patient record);

    int delPatient(int id);

    Patient findById(int id);

    /**
     * 分页查询用户列表
     * @param page
     * @param limit
     * @return
     */
    PageDataResult getPatients(Patient patient, int page, int limit);
}
