package com.hmt.graduate.paper.controller.patients;

import com.hmt.graduate.paper.controller.BaseController;
import com.hmt.graduate.paper.entity.PatientDTO;
import com.hmt.graduate.paper.entity.UserSearchDTO;
import com.hmt.graduate.paper.exception.BizException;
import com.hmt.graduate.paper.exception.ExceptionEnum;
import com.hmt.graduate.paper.pojo.MmseQuestions;
import com.hmt.graduate.paper.pojo.Patient;
import com.hmt.graduate.paper.service.patients.MmseQuestionService;
import com.hmt.graduate.paper.service.patients.PatientService;
import com.hmt.graduate.paper.utils.PageDataResult;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientsController implements BaseController {

    @Autowired
    private MmseQuestionService questionService;

    @Autowired
    private PatientService patientService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index(){
        logger.info("患者信息查询");
        return new ModelAndView("/patients/questions");
    }

    @RequestMapping(value = "/questions", method = RequestMethod.GET)
    @ResponseBody
    public List<MmseQuestions> questionsList(){
        logger.info("=============查询题库==========================");
        List<MmseQuestions> questionList = null;
        try{
            questionList = questionService.selectAllQuestions();
            logger.debug("查询所有测试题目-" + questionList);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("新增权限异常！", e);
        }
        return questionList;
    }

    @RequestMapping(value = "/patients", method = RequestMethod.GET)
    public ModelAndView patientList(){
        logger.info("=============查询患者==========================");
        ModelAndView mav = new ModelAndView("/patients/patients");
        try{
            List<Patient> patientList = patientService.selectAllPatients();
            logger.debug("查询所有患者信息-" + patientList);
            mav.addObject("patientList", patientList);
            mav.addObject("msg", "ok");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("新增权限异常！", e);
        }
        return mav;
    }

    @RequestMapping(value = "/editPatient", method = RequestMethod.POST)
    @ResponseBody
    public String editPatient(PatientDTO patientDTO) {
        String type = (patientDTO.getId() == null ? "新增" : "修改");
        logger.debug("患者:{ " + patientDTO + " }");
        try {
            if (null != patientDTO) {
                Patient patient = new Patient();
                BeanUtils.copyProperties(patientDTO, patient);
                patient.setIllnessTime(new SimpleDateFormat("yyyy-MM-dd").parse(patientDTO.getIllnessTime()));
                if (patientDTO.getId() == null) {
//                    patient.setId(System.currentTimeMillis());
                    patient.setCreateDate(new Date());
                    patient.setHispitalNo(System.currentTimeMillis()+"");
                    //编辑权限
                    this.patientService.insert(patient);
                } else {
//                    permission.setInsertTime(date);
                    //增加子节点权限
                    this.patientService.update(patient);
                }
                logger.debug("添加患者成功！-permission-" + patient);
                return patient.getId()+"";
            }
        } catch (Exception e) {
            logger.error("添加患者异常！", e);
        }
        return RETURN_PATIENT_ADDFAIL;
    }

    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ResponseBody
    public String del(
            @RequestParam("id") int id) {
        logger.debug("删除患者--id-" + id);
        try {
            if (id > 0) {
                return this.patientService.delPatient(id) == 1 ? "ok" : "删除患者异常";
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("删除患者异常！", e);
        }
        return RETURN_AUTH_FAIL;
    }

    @RequestMapping(value = "/getPatient", method = RequestMethod.GET)
    @ResponseBody
    public Patient getPatient(
            @RequestParam("id") Integer id) {
        logger.debug("获取患者--id-" + id);
        try {
            if (id > 0) {
                Patient patient = this.patientService.findById(id);
                logger.debug("获取权限成功！-permission-" + patient);
                return patient;
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("获取患者信息异常！", e);
        }
        return null;
    }

    /**
     * 分页查询用户列表
     * @return ok/fail
     */
    @RequestMapping(value = "/getPatients", method = RequestMethod.POST)
    @ResponseBody
//    @RequiresPermissions(value = "usermanage")
    public PageDataResult getPatients(@RequestParam("page") Integer page,
                                   @RequestParam("limit") Integer limit, PatientDTO patientDTO) {
        logger.debug("分页查询患者列表！搜索条件：userSearch：" + patientDTO + ",page:" + page
                + ",每页记录数量limit:" + limit);
        PageDataResult pdr = new PageDataResult();
        try {
            Patient patient = new Patient();
            if (!StringUtils.isBlank(patientDTO.getName())){
                patient.setName(patientDTO.getName());

            }
            if (StringUtils.isBlank(patientDTO.getHispitalNo())){
                patient.setHispitalNo(null);
            } else {
                patient.setHispitalNo(patientDTO.getHispitalNo());
            }
//            if (StringUtils.isBlank(patient.getName()) && StringUtils.isBlank(patient.getHispitalNo())) {
//                throw new BizException("请输入患者姓名或者住院号");
//            }
            if (null == page) {
                page = 1;
            }
            if (null == limit) {
                limit = 10;
            }
            // 获取用户和角色列表
            pdr = patientService.getPatients(patient, page, limit);
            logger.debug("患者列表查询=pdr:" + pdr);

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("患者列表查询异常！", e);
        }
        return pdr;
    }
}
