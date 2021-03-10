package com.hmt.graduate.paper.service.patients;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hmt.graduate.paper.dao.CamMapper;
import com.hmt.graduate.paper.pojo.Cam;
import com.hmt.graduate.paper.pojo.Patient;
import com.hmt.graduate.paper.reflection.ReflectBeanToSum;
import com.hmt.graduate.paper.utils.PageDataResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CamServiceImpl implements CamService {
    private static final Logger logger = LoggerFactory.getLogger(CamServiceImpl.class);

    @Autowired
    private CamMapper camMapper;

    @Override
    public int insert(Cam record) {
        return camMapper.insert(record);
    }

    @Override
    public int insertSelective(Cam record) {
        return camMapper.insertSelective(record);
    }

    @Override
    public PageDataResult selectCamByPatientId(Integer patientId, int page, int limit) throws Exception{
        PageDataResult pdr = new PageDataResult();
        PageHelper.startPage(page, limit);
        List<Cam> urList = camMapper.selectCamByPatientId(patientId);
        //反射遍历所有的属性
        for (Cam cam : urList) {
            ReflectBeanToSum.sumForAllFiled(cam);
        }
        // 获取分页查询后的数据
        PageInfo<Cam> pageInfo = new PageInfo<>(urList);
        //计算总分

        // 设置获取到的总记录数total：
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        pdr.setList(urList);
        return pdr;
    }

}
