package com.hmt.graduate.paper.controller.patients;

import com.hmt.graduate.paper.controller.BaseController;
import com.hmt.graduate.paper.entity.CamDTO;
import com.hmt.graduate.paper.entity.MmseDTO;
import com.hmt.graduate.paper.exception.BizException;
import com.hmt.graduate.paper.pojo.Cam;
import com.hmt.graduate.paper.pojo.MmseScore;
import com.hmt.graduate.paper.pojo.Patient;
import com.hmt.graduate.paper.service.patients.CamService;
import com.hmt.graduate.paper.service.patients.MmseQuestionService;
import com.hmt.graduate.paper.service.patients.MmseScoreService;
import com.hmt.graduate.paper.service.patients.PatientService;
import com.hmt.graduate.paper.utils.PageDataResult;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/recognite")
public class RecogniteTestController implements BaseController {

    @Autowired
    private MmseQuestionService questionService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private CamService camService;

    @Autowired
    private MmseScoreService mmseScoreService;

    @RequestMapping(value = "/indexCam", method = RequestMethod.GET)
    public ModelAndView index(){
        logger.info("跳转到CAM认知测试");
        return new ModelAndView("/patients/testCam");
    }

    @RequestMapping(value = "/addCam", method = RequestMethod.POST)
    @ResponseBody
    public String setCAM(CamDTO camDTO) {
        logger.info("保存CAM测试结果");
        try{
            if (camDTO == null || camDTO.getCamPatientId() == null
                    || camDTO.getCamPatientId() == -1) {
                throw  new BizException("未找到关联的患者，请检查患者信息后再试");
            }
            Patient patient = patientService.findById(camDTO.getCamPatientId());
            if (patient == null){
                throw  new BizException("未找到关联的患者，请检查患者信息后再试");
            }
            Cam cam = new Cam();
            BeanUtils.copyProperties(cam, camDTO);
            cam.setCreateTime(new Date());
            cam.setPatientId(camDTO.getCamPatientId());
            int success = camService.insert(cam);
            if (success == 1){
                return RETURN_OK;
            }
            return RETURN_NO;
        } catch (Exception e) {
            logger.error("添加患者异常！", e);
        }
        return RETURN_CAM_ADDFAIL;
    }

    @RequestMapping(value = "/camList", method = RequestMethod.POST)
    @ResponseBody
    public PageDataResult camList(@RequestParam("page") Integer page,
                                  @RequestParam("limit") Integer limit,
                                  Integer patientId) {
        logger.info("根据患者patienId查询所有的谵妄测试结果:"+patientId);
        PageDataResult pdr = new PageDataResult();
        try{
            if (null == page) {
                page = 1;
            }
            if (null == limit) {
                limit = 10;
            }
            if (patientId == null){
                throw  new BizException("患者patientId为空");
            }
            Patient patient = patientService.findById(patientId);
            if (patient == null){
                throw  new BizException("未找到关联的患者，请检查患者信息后再试");
            }
            pdr = camService.selectCamByPatientId(patientId, page, limit);
            logger.debug("根据患者patienId查询所有的谵妄测试结果=pdr:" + pdr);
        } catch (Exception e) {
            logger.error("查询谵妄测试异常！", e);
        }
        return pdr;
    }

    @RequestMapping(value = "/indexMmse", method = RequestMethod.GET)
    public ModelAndView indexMmse(){
        logger.info("跳转到MMSE认知测试");
        return new ModelAndView("/patients/testMmse");
    }

    @RequestMapping(value = "/addMmse", method = RequestMethod.POST)
    @ResponseBody
    public String setMmse(MmseDTO mmseDTO) {
        logger.info("保存MMSE测试结果");
        try{
            if (mmseDTO == null || mmseDTO.getMmsePatientId() == null
                    || mmseDTO.getMmsePatientId() == -1) {
                throw  new BizException("未找到关联的患者，请检查患者信息后再试");
            }
            Patient patient = patientService.findById(mmseDTO.getMmsePatientId());
            if (patient == null) {
                throw  new BizException("未找到关联的患者，请检查患者信息后再试");
            }
            MmseScore mmseScore = new MmseScore();
            BeanUtils.copyProperties(mmseScore, mmseDTO);
            mmseScore.setCrateTime(new Date());
            mmseScore.setPatientId(mmseDTO.getMmsePatientId());
            int success = mmseScoreService.insert(mmseScore);
            if (success == 1){
                return RETURN_OK;
            }
            return RETURN_NO;
        } catch (Exception e) {
            logger.error("添加患者异常！", e);
        }
        return RETURN_MMSE_ADDFAIL;
    }

    @RequestMapping(value = "/mmseList", method = RequestMethod.POST)
    @ResponseBody
    public PageDataResult mmseList(@RequestParam("page") Integer page,
                                  @RequestParam("limit") Integer limit,
                                  Integer patientId) {
        logger.info("根据患者patienId查询所有的MMSE测试结果:"+patientId);
        PageDataResult pdr = new PageDataResult();
        try{
            if (null == page) {
                page = 1;
            }
            if (null == limit) {
                limit = 10;
            }
            if (patientId == null){
                throw  new BizException("患者patientId为空");
            }
            Patient patient = patientService.findById(patientId);
            if (patient == null){
                throw  new BizException("未找到关联的患者，请检查患者信息后再试");
            }
            pdr = mmseScoreService.selectMmseByPatientId(patientId, page, limit);
            logger.debug("根据患者patienId查询所有的谵妄测试结果=pdr:" + pdr);
        } catch (Exception e) {
            logger.error("查询谵妄测试异常！", e);
        }
        return pdr;
    }

}
