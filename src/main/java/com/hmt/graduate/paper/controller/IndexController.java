package com.hmt.graduate.paper.controller;

import com.alibaba.fastjson.JSONObject;
import com.hmt.graduate.paper.constant.EnumStatus;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/")
public class IndexController implements BaseController {

//	@Autowired
//	private ParamProperties paramProperties;

	@RequestMapping("/home")
	public String toHome(HttpServletRequest request) {
		logger.debug("-------------home------------");
		//shiro-Session的优先级高于使用servlet的session
		logger.debug("Session过期时间:{}",request.getSession().getMaxInactiveInterval());
		logger.debug("shiro-Session过期时间:{}", SecurityUtils.getSubject().getSession().getTimeout());
		return "home";
	}

	@RequestMapping("/{page}")
	public String toPage(
			@PathVariable("page") String page) {
		logger.debug("-------------toindex------------" + page);
		return page;
	}

	@RequestMapping(value = "/enumCache", method = RequestMethod.GET)
	@ResponseBody
	public String enumCache(){
		JSONObject jsonMap = new JSONObject();
		try{
			JSONObject sexJson = new JSONObject();
			for (EnumStatus.SexEnum sexEnum : EnumStatus.SexEnum.values()) {
				sexJson.put(sexEnum.getCode().toString(), sexEnum.getValue());
			}
			jsonMap.put("SexEnum", sexJson);
			JSONObject degreeMap = new JSONObject();
			for (EnumStatus.DegreeEnum degreeEnum : EnumStatus.DegreeEnum.values()) {
				degreeMap.put(degreeEnum.getCode().toString(), degreeEnum.getValue());
			}
			jsonMap.put("DegreeEnum", degreeMap);
			JSONObject marriageMap = new JSONObject();
			for (EnumStatus.MarriageEnum marriageEnum : EnumStatus.MarriageEnum.values()) {
				marriageMap.put(marriageEnum.getCode().toString(), marriageEnum.getValue());
			}
			jsonMap.put("MarriageEnum", marriageMap);
			JSONObject camMap = new JSONObject();
			for (EnumStatus.CAMEnum camEnum : EnumStatus.CAMEnum.values()) {
				camMap.put(camEnum.getCode().toString(), camEnum.getValue());
			}
			jsonMap.put("CAMEnum", camMap);
			JSONObject surgeryMap = new JSONObject();
			for (EnumStatus.SurgeryEnum surgeryEnum : EnumStatus.SurgeryEnum.values()) {
				surgeryMap.put(surgeryEnum.getCode().toString(), surgeryEnum.getValue());
			}
			jsonMap.put("SurgeryEnum", surgeryMap);

		}catch (Exception e) {
			logger.error("枚举转化异常");
		}

		return jsonMap.toJSONString();
	}

}
