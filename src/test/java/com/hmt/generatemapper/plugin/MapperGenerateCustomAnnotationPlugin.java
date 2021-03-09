package com.hmt.generatemapper.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.plugins.MapperAnnotationPlugin;

/**
 * 工具产生的mapper文件，带注解，不被spring注入
 * 
 * @author Administrator
 *
 */
public class MapperGenerateCustomAnnotationPlugin extends MapperAnnotationPlugin{

	
	 @Override
	    public boolean validate(List<String> warnings){
	        return true;
	    }

	    @Override
	    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
	    	String fullQualifiedName = interfaze.getType().getFullyQualifiedName();
	        if(fullQualifiedName.endsWith("Ext")) {
	        	interfaze.addImportedType(new FullyQualifiedJavaType("javax.inject.Named"));
		        interfaze.addAnnotation("@MapperIntfAnnotation(value =\""+fullQualifiedName+"\")");
	        }
	        
//	        else {
//	        	interfaze.addImportedType(new FullyQualifiedJavaType("com.clover.expand.mybatis.mapper.annotation.NoMapperIntfAnnotation"));
//		        interfaze.addAnnotation("@NoMapperIntfAnnotation");
//	        }
	    	
	        return true;
	    }

	
}
