package com.hmt.graduate.paper.service.patients;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hmt.graduate.paper.dao.MmseScoreMapper;
import com.hmt.graduate.paper.pojo.MmseScore;
import com.hmt.graduate.paper.utils.PageDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MmseScoreServiceImpl implements MmseScoreService {

    @Autowired
    private MmseScoreMapper mmseScoreMapper;

    @Override
    public int insert(MmseScore record) {
        return mmseScoreMapper.insert(record);
    }

    @Override
    public int insertSelective(MmseScore record) {
        return mmseScoreMapper.insertSelective(record);
    }

    @Override
    public PageDataResult selectMmseByPatientId(Integer patientId, int page, int limit) throws Exception {
        PageDataResult pdr = new PageDataResult();
        PageHelper.startPage(page, limit);
        List<MmseScore> urList = mmseScoreMapper.selectMmseByPatientId(patientId);
        // 获取分页查询后的数据
        PageInfo<MmseScore> pageInfo = new PageInfo<>(urList);
        //计算总分

        // 设置获取到的总记录数total：
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        pdr.setList(urList);
        return pdr;
    }


}
