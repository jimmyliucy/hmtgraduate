package com.hmt.graduate.paper.aop;


import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;

import com.lycheepay.clearing.annotation.NamedMapper;

public class ClearAnnotationBeanNameGenerator  extends AnnotationBeanNameGenerator {

	
	protected final static Logger log = LoggerFactory.getLogger(ClearAnnotationBeanNameGenerator.class);
	
	@Override
	public String generateBeanName(BeanDefinition definition,
			BeanDefinitionRegistry registry) {
			try {
				Class<?> clazz = Class.forName(definition.getBeanClassName());
		        if (clazz.isAnnotationPresent(NamedMapper.class)) {
		        	String beanName = clazz.getAnnotation(NamedMapper.class).value();
		        	if(StringUtils.isEmpty(beanName)){
		        		beanName =  super.generateBeanName(definition, registry);
		        	}
		        	log.info("ClearAnnotationBeanNameGenerator-->>beanName:"+beanName+"---clazz-->>:"+ clazz.toString());
		        	return beanName;
		        }else {
		        	return super.generateBeanName(definition, registry);
		        }
			} catch(Exception e) {
				return super.generateBeanName(definition, registry);
			}
	}
}
