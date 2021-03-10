package com.hmt.generatemapper.generator;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;
import static org.mybatis.generator.internal.util.messages.Messages.getString;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.codegen.AbstractXmlGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.JavaMapperGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.AbstractJavaMapperMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.InsertMethodGenerator;
import org.mybatis.generator.config.PropertyRegistry;

import com.hmt.generatemapper.generator.jmethod.InsertSelectiveMethodGenerator;
import com.hmt.generatemapper.generator.jmethod.SelectByPrimaryKeyMethodGenerator;
import com.hmt.generatemapper.generator.jmethod.UpdateByPrimaryKeySelectiveMethodGenerator;



public class ClearJavaClientGenerator extends JavaMapperGenerator {

	public ClearJavaClientGenerator() {
		super();
	}

	public ClearJavaClientGenerator(boolean requiresMatchedXMLGenerator) {
		super(requiresMatchedXMLGenerator);
	}

	@Override
	public AbstractXmlGenerator getMatchedXMLGenerator() {
		return new ClearXMLMapperGenerator();
	}
	
	 @Override
	    public List<CompilationUnit> getCompilationUnits() {
	        progressCallback.startTask(getString("Progress.17", //$NON-NLS-1$
	                introspectedTable.getFullyQualifiedTable().toString()));
	        CommentGenerator commentGenerator = context.getCommentGenerator();

	        String mapperType = introspectedTable.getMyBatis3JavaMapperType();
	        
	        FullyQualifiedJavaType type = new FullyQualifiedJavaType(mapperType);
	        Interface interfaze = new Interface(type);
	        interfaze.setVisibility(JavaVisibility.PUBLIC);
	        commentGenerator.addJavaFileComment(interfaze);

	        String rootInterface = introspectedTable
	                .getTableConfigurationProperty(PropertyRegistry.ANY_ROOT_INTERFACE);
	        if (!stringHasValue(rootInterface)) {
	            rootInterface = context.getJavaClientGeneratorConfiguration()
	                    .getProperty(PropertyRegistry.ANY_ROOT_INTERFACE);
	        }

	        if (stringHasValue(rootInterface)) {
	            FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType(
	                    rootInterface);
	            interfaze.addSuperInterface(fqjt);
	            interfaze.addImportedType(fqjt);
	        }


	        addDeleteByPrimaryKeyMethod(interfaze);
	        addInsertMethod(interfaze);
	        addInsertSelectiveMethod(interfaze);
	        addSelectByPrimaryKeyMethod(interfaze);
	        addUpdateByPrimaryKeySelectiveMethod(interfaze);
	        addUpdateByPrimaryKeyWithoutBLOBsMethod(interfaze);


	        
	        List<CompilationUnit> answer = new ArrayList<CompilationUnit>();
	        if (context.getPlugins().clientGenerated(interfaze, null,
	                introspectedTable)) {
	            answer.add(interfaze);
	        }

	        List<CompilationUnit> extraCompilationUnits = getExtraCompilationUnits();
	        if (extraCompilationUnits != null) {
	            answer.addAll(extraCompilationUnits);
	        }
	        
	        


			String targetProject = this.context.getJavaClientGeneratorConfiguration().getTargetProject();
			if(!targetProject.endsWith(File.separator)) {
				targetProject = targetProject+File.separator;
			}
			String[] paths = mapperType.split("[.]");
			for (String path : paths) {
				targetProject = targetProject+path+File.separator;
			}
			
			//如果自定义mapper接口已经产生，那么不再需要产生，由开发同事自己维护
			String mapperExtTypeJavaPath =targetProject.substring(0, targetProject.length()-1)+"Ext.java";
			File file = new File(mapperExtTypeJavaPath);
			if(!file.exists()) {
				FullyQualifiedJavaType typeExt = new FullyQualifiedJavaType(mapperType + "Ext");
				Interface interfazeExt = new Interface(typeExt);
				interfazeExt.setVisibility(JavaVisibility.PUBLIC);
				commentGenerator.addJavaFileComment(interfazeExt);
				
				if (context.getPlugins().clientGenerated(interfazeExt, null, introspectedTable)) {
					answer.add(interfazeExt);
				}
				interfazeExt.addSuperInterface(type);
				
			}
	        return answer;
	    }
	
	  protected void addInsertMethod(Interface interfaze) {
	        if (introspectedTable.getRules().generateInsert()) {
	            AbstractJavaMapperMethodGenerator methodGenerator = new InsertMethodGenerator(true);
	            initializeAndExecuteGenerator(methodGenerator, interfaze);
	        }
	
	  }
	  
	  
	  protected void addInsertSelectiveMethod(Interface interfaze) {
	        if (introspectedTable.getRules().generateInsertSelective()) {
	            AbstractJavaMapperMethodGenerator methodGenerator = new InsertSelectiveMethodGenerator(true);
	            initializeAndExecuteGenerator(methodGenerator, interfaze);
	        }
	    }
	  
	  protected void addUpdateByPrimaryKeySelectiveMethod(Interface interfaze) {
	        if (introspectedTable.getRules().generateUpdateByPrimaryKeySelective()) {
	            AbstractJavaMapperMethodGenerator methodGenerator = new UpdateByPrimaryKeySelectiveMethodGenerator(true);
	            initializeAndExecuteGenerator(methodGenerator, interfaze);
	        }
	    } 
	  
	  protected void addSelectByPrimaryKeyMethod(Interface interfaze) {
	        if (introspectedTable.getRules().generateSelectByPrimaryKey()) {
	            AbstractJavaMapperMethodGenerator methodGenerator = new SelectByPrimaryKeyMethodGenerator(false,true);
	            initializeAndExecuteGenerator(methodGenerator, interfaze);
	        }
	    }
	  
}
