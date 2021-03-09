package com.hmt.graduate.paper.service.patients;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hmt.graduate.paper.dao.PatientMapper;
import com.hmt.graduate.paper.entity.PatientDTO;
import com.hmt.graduate.paper.entity.UserRoleDTO;
import com.hmt.graduate.paper.pojo.Patient;
import com.hmt.graduate.paper.utils.PageDataResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    private static final Logger logger = LoggerFactory.getLogger(CamServiceImpl.class);

    @Autowired
    private PatientMapper patientMapper;

    @Override
    public int insert(Patient record) {
        return patientMapper.insert(record);
    }

    @Override
    public int insertSelective(Patient record) {
        return patientMapper.insertSelective(record);
    }

    public List<Patient> selectAllPatients(){
        return patientMapper.selectAllPatients();
    }

    public int update (Patient record){
        return patientMapper.update(record);
    }

    public int delPatient(int id){
        return patientMapper.delPatient(id);
    }

    public Patient findById(int id) {
        return patientMapper.findById(id);
    }

    @Override
    public PageDataResult getPatients(Patient patient, int page, int limit) {
        PageDataResult pdr = new PageDataResult();
        PageHelper.startPage(page, limit);
        List<Patient> urList = patientMapper.selectByParam(patient);
        // 获取分页查询后的数据
        PageInfo<Patient> pageInfo = new PageInfo<>(urList);
        // 设置获取到的总记录数total：
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        pdr.setList(urList);
        return pdr;
    }

}
