package com.hmt.graduate.paper.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * SpringMVC配置
 */
@Configuration
public class SpringWebMvcConfig implements WebMvcConfigurer {

	/**
	 * 添加自定义静态资源映射路径和静态资源存放路径
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/images/**").addResourceLocations("/images/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
		registry.addResourceHandler("/layui/**").addResourceLocations("/layui/");
		registry.addResourceHandler("/treegrid/**").addResourceLocations("/treegrid/");
//		registry.addResourceHandler("/META-INF/**").addResourceLocations("/META-INF/");
	}

	/**
	 * idea开发效果不能显示出来，废弃此方法，eclipse可以使用，故未删除
	 * @param registry
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/record").setViewName("/WEB-INF/operator/record");
	}
}
