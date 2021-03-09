package com.hmt.graduate.paper.service.patients;

import com.hmt.graduate.paper.pojo.MmseScore;
import com.hmt.graduate.paper.utils.PageDataResult;

public interface MmseScoreService {

    int insert(MmseScore record);

    int insertSelective(MmseScore record);

    PageDataResult selectMmseByPatientId(Integer patientId, int page, int limit) throws Exception;

}
