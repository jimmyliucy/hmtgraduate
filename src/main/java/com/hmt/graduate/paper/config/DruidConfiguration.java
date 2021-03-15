package com.hmt.graduate.paper.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@SuppressWarnings("all")
public class DruidConfiguration {

	@Bean
	public ServletRegistrationBean druidServlet() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
		servletRegistrationBean.setServlet(new StatViewServlet());
		servletRegistrationBean.addUrlMappings("/druid/*");
		Map<String, String> initParameters = new HashMap<String, String>();
		initParameters.put("loginUsername", "admin");// 用户名
		initParameters.put("loginPassword", "admin1234");// 密码
		initParameters.put("resetEnable", "false");// 禁用HTML页面上的“Reset All”功能
		initParameters.put("allow", ""); // IP白名单 (没有配置或者为空，则允许所有访问)
		// initParameters.put("deny", "192.168.20.38");// IP黑名单
		// (存在共同时，deny优先于allow)
		servletRegistrationBean.setInitParameters(initParameters);
		return servletRegistrationBean;
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new WebStatFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		// @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//
		// 忽略资源
		filterRegistrationBean.addInitParameter("exclusions",
				"*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
		return filterRegistrationBean;
	}

	/**
	 * <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
	 * 		<property name="basePackage" value="com.lycheepay.clearing" />
	 * 		<property name="nameGenerator" ref="clearAnnotationBeanNameGenerator"/>
	 * 		<property name="annotationClass" value="com.lycheepay.clearing.annotation.NamedMapper" />  <!-- 添加了NamedMapper注解的接口才实列话成mapper实例 -->
	 * 		<property name="sqlSessionFactoryBeanName" value="sqlSessionFactory" />
	 * 	</bean>
	 * @param basePackage
	 * @return
	 */
//	@Bean
//	public MapperScannerConfigurer mapperScannerConfigurer(@Value("${com.hmt.graduate.paper.dao}") String basePackage) {
//		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//		mapperScannerConfigurer.setBasePackage(basePackage);
//		mapperScannerConfigurer.setNameGenerator();
//		return mapperScannerConfigurer;
//	}

}