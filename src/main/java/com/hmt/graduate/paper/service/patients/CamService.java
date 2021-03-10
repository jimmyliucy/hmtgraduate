package com.hmt.graduate.paper.service.patients;

import com.hmt.graduate.paper.pojo.Cam;
import com.hmt.graduate.paper.utils.PageDataResult;

import java.util.List;

public interface CamService {

    int insert(Cam record);

    int insertSelective(Cam record);

    PageDataResult selectCamByPatientId(Integer patientId, int page, int limit) throws Exception;
}
