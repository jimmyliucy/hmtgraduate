package com.hmt.graduate.paper;

import com.hmt.graduate.paper.aop.ClearAnnotationBeanNameGenerator;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hmt.graduate.paper"}, nameGenerator = ClearAnnotationBeanNameGenerator.class)
public class AdminApplication {

	private static String[] args;

	public static void main(String[] args) {
		AdminApplication.args = args;
		SpringApplication sa = new SpringApplication(AdminApplication.class);
		// 禁用devTools热部署
		//System.setProperty("spring.devtools.restart.enabled", "false");
		// 禁用命令行更改application.properties属性
		sa.setAddCommandLineProperties(false);
		sa.run(args);
	}
}
