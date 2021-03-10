package com.hmt.graduate.paper.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface BaseController {

    public static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    public static final String RETURN_OK = "ok";

    public static final String RETURN_NO = "no";

    public static final String RETURN_NO_AUTH = "设置权限出错，请您稍后再试";

    public static final String RETURN_AUTH_FAIL = "删除权限出错，请您稍后再试";

    public static final String RETURN_ACTION_ERROR = "操作错误，请您稍后再试";

    public static final String RETURN_ROLE_FAIL = "删除角色出错，请您稍后再试";

    public static final String RETURN_PATIENT_ADDFAIL = "添加患者出错，请您稍后再试";

    public static final String RETURN_CAM_ADDFAIL = "保存谵妄测试出错，请您稍后再试";

    public static final String RETURN_MMSE_ADDFAIL = "保存MMSE测试出错，请您稍后再试";

}
