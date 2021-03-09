package com.hmt.graduate.paper.controller.operator;

import com.hmt.graduate.paper.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/record")
public class RecordController implements BaseController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index(){
        logger.info("跳转到录入功能");
        return new ModelAndView("/operator/record");
    }

}
