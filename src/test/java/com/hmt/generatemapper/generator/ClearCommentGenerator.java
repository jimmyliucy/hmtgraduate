package com.hmt.generatemapper.generator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.springframework.util.StringUtils;

public class ClearCommentGenerator extends DefaultCommentGenerator {

    private Properties properties;

    public ClearCommentGenerator() {
        properties = new Properties();
    }

    @Override
    public void addConfigurationProperties(Properties properties) {
    	super.addConfigurationProperties(properties);
        this.properties.putAll(properties);
    }

    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        String author = properties.getProperty("author");
        String dateFormat = properties.getProperty("dateFormat", "yyyy-MM-dd");
        SimpleDateFormat dateFormatter = new SimpleDateFormat(dateFormat);

        // 获取表注释
        String remarks = introspectedTable.getRemarks();

        topLevelClass.addJavaDocLine("/**");
        if(!StringUtils.isEmpty(remarks)) {
            topLevelClass.addJavaDocLine(" * " + remarks);
            topLevelClass.addJavaDocLine(" *");
        }
        topLevelClass.addJavaDocLine(" * @author " + author);
        topLevelClass.addJavaDocLine(" * @date " + dateFormatter.format(new Date()));
        topLevelClass.addJavaDocLine(" */");
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        // 获取列注释
        String remarks = introspectedColumn.getRemarks();
        field.addJavaDocLine("/**");
        field.addJavaDocLine(" * " + remarks);
        field.addJavaDocLine(" */");
    }
    
    
    @Override
	public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
		super.addGeneralMethodComment(method, introspectedTable);
	}
    
    
  //将 namespace修改掉
  	@Override
  	public void addRootComment(XmlElement rootElement) {
  		super.addRootComment(rootElement);
  		Object generateExt = properties.get("generateExt");
  		if(null==generateExt||!generateExt.toString().equals("true"))
  		{
  			return;
  		}
  		List<Attribute> lists =  rootElement.getAttributes();
  		int delIndex = -1;String orginNameSpace="";
  		for(int i = 0;i<lists.size();i++){
  			if(lists.get(i).getName().equals("namespace")){
  				orginNameSpace = lists.get(i).getValue();
  				//if(orginNameSpace.endsWith("Ext"))break;
  				delIndex = i;
  				break;
  			}
  		}
  		if(delIndex!=-1){
  			lists.remove(delIndex);
  			rootElement.getAttributes().add(new Attribute("namespace", orginNameSpace+"Ext"));
  		}
  	}
  	
  	
//  	 @Override
//     public void addJavaFileComment(CompilationUnit compilationUnit) {
//
// 		/*super.addJavaFileComment(compilationUnit);*/
// 		//如果没有选择生成扩展类 则给JavaModel 加上 @Resource注解
// 		String generateExt = properties.getProperty("generateExt");
// 		if(generateExt==null||!generateExt.equals("true")){
//
// 			//生成的是 JavaModel 和 JavaModelExample 文件
// 			if(compilationUnit instanceof TopLevelClass){
// 				/*TopLevelClass topLevelClass = (TopLevelClass)compilationUnit;
// 				String shortName = compilationUnit.getType().getShortName();
// 				topLevelClass.addAnnotation("@Resource");
// 				topLevelClass.addImportedType("javax.annotation.Resource");*/
// 			}
//
// 			//生成的是Mapper.java 文件
// 			if(compilationUnit instanceof Interface){
// 				Interface anInterface = (Interface)compilationUnit;
// 				//下面的可以给JavaFile 添加注释
// 				//topLevelClass.addFileCommentLine("/**generator by Shirc generator common.....**/");
// 				String shortName = compilationUnit.getType().getShortName();
// 				if(shortName==null||!shortName.endsWith("Mapper"))return;
// 				//只给JavaModel添加注解就行了，Example不需要
// 				anInterface.addAnnotation("@Resource");
// 				anInterface.addImportedType(new FullyQualifiedJavaType("javax.annotation.Resource"));
// 			}
// 		}
//
// 	
//     }
  	
    
}

