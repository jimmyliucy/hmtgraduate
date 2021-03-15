package com.hmt.graduate.paper.aop;


import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;

import com.hmt.graduate.paper.annotation.NamedMapper;

public class AnnotationBeanNameGeneratorImpl extends AnnotationBeanNameGenerator {

	
	protected final static Logger log = LoggerFactory.getLogger(AnnotationBeanNameGeneratorImpl.class);
	
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
		        	log.info("AnnotationBeanNameGeneratorImpl-->>beanName:"+beanName+"---clazz-->>:"+ clazz.toString());
		        	return beanName;
		        }else {
		        	return super.generateBeanName(definition, registry);
		        }
			} catch(Exception e) {
				return super.generateBeanName(definition, registry);
			}
	}
}
