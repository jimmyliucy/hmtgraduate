package com.hmt.generatemapper.generator;

import static org.mybatis.generator.internal.util.messages.Messages.getString;

import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.XMLMapperGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.AbstractXmlElementGenerator;

import com.hmt.generatemapper.generator.elements.ColumnListElementGenerator;
import com.hmt.generatemapper.generator.elements.InsertElementGenerator;
import com.hmt.generatemapper.generator.elements.InsertSelectiveElementGenerator;
import com.hmt.generatemapper.generator.elements.ResultMapElementGenerator;
import com.hmt.generatemapper.generator.elements.SQLIdUpdateSetGenerator;
import com.hmt.generatemapper.generator.elements.SelectByPrimaryKeyElementGenerator;
import com.hmt.generatemapper.generator.elements.UpdateByPrimaryKeyElementGenerator;
import com.hmt.generatemapper.generator.elements.UpdateByPrimaryKeySelectiveElementGenerator;



public class ClearXMLMapperGenerator extends XMLMapperGenerator{

    public ClearXMLMapperGenerator() {
        super();
    }

    protected XmlElement getSqlMapElement() {
        FullyQualifiedTable table = introspectedTable.getFullyQualifiedTable();
        progressCallback.startTask(getString(
                "Progress.12", table.toString())); //$NON-NLS-1$
        XmlElement answer = new XmlElement("mapper"); //$NON-NLS-1$
        String namespace = introspectedTable.getMyBatis3SqlMapNamespace();
        answer.addAttribute(new Attribute("namespace", //$NON-NLS-1$
                namespace));

        context.getCommentGenerator().addRootComment(answer);

//        addResultMapWithoutBLOBsElement(answer);
//        addResultMapWithBLOBsElement(answer);
        
        
        addResultMapElement(answer);//已覆盖实现
        
//        addExampleWhereClauseElement(answer);
//        addMyBatis3UpdateByExampleWhereClauseElement(answer);
        addColumnListElement(answer);//已覆盖实现
//        addBaseColumnListElement(answer);
//        addBlobColumnListElement(answer);
//        addSelectByExampleWithBLOBsElement(answer);
//        addSelectByExampleWithoutBLOBsElement(answer);
        addSelectByPrimaryKeyElement(answer);//已覆盖实现
        addDeleteByPrimaryKeyElement(answer);//无需覆盖
       

        addInsertElement(answer);//已覆盖实现
        addInsertSelectiveElement(answer);//已覆盖实现
       
        
//        addCountByExampleElement(answer);
//        addUpdateByExampleSelectiveElement(answer);
//        addUpdateByExampleWithBLOBsElement(answer);
//        addUpdateByExampleWithoutBLOBsElement(answer);
        addUpdateByPrimaryKeySelectiveElement(answer);//已覆盖实现
        
//        addUpdateByPrimaryKeyWithBLOBsElement(answer);
//        addUpdateByPrimaryKeyWithoutBLOBsElement(answer);
        addUpdateByPrimaryKeyElement(answer);
        
        addSQLIdUpdateSetElement(answer);
        return answer;
    }

    protected void addSQLIdUpdateSetElement(XmlElement parentElement) {
    	if (introspectedTable.getRules().generateBaseColumnList()) {
            AbstractXmlElementGenerator elementGenerator = new SQLIdUpdateSetGenerator();
            initializeAndExecuteGenerator(elementGenerator, parentElement);
        }
    }
    
    
    protected void addColumnListElement(XmlElement parentElement) {
    	if (introspectedTable.getRules().generateBaseColumnList()) {
            AbstractXmlElementGenerator elementGenerator = new ColumnListElementGenerator();
            initializeAndExecuteGenerator(elementGenerator, parentElement);
        }
    }
    
    
    protected void addResultMapElement(XmlElement parentElement) {
    	if (introspectedTable.getRules().generateBaseColumnList()) {
            AbstractXmlElementGenerator elementGenerator = new ResultMapElementGenerator(false);
            initializeAndExecuteGenerator(elementGenerator, parentElement);
        }
    }
    
    protected void addSelectByPrimaryKeyElement(XmlElement parentElement) {
        if (introspectedTable.getRules().generateSelectByPrimaryKey()) {
            AbstractXmlElementGenerator elementGenerator = new SelectByPrimaryKeyElementGenerator();
            initializeAndExecuteGenerator(elementGenerator, parentElement);
        }
    }
    
    protected void addInsertElement(XmlElement parentElement) {
        if (introspectedTable.getRules().generateInsert()) {
            AbstractXmlElementGenerator elementGenerator = new InsertElementGenerator(true);
            initializeAndExecuteGenerator(elementGenerator, parentElement);
        }
    }
    
    
    protected void addInsertSelectiveElement(XmlElement parentElement) {
        if (introspectedTable.getRules().generateInsertSelective()) {
            AbstractXmlElementGenerator elementGenerator = new InsertSelectiveElementGenerator(true);
            initializeAndExecuteGenerator(elementGenerator, parentElement);
        }
    }
    
    
    protected void addUpdateByPrimaryKeySelectiveElement(
            XmlElement parentElement) {
        if (introspectedTable.getRules().generateUpdateByPrimaryKeySelective()) {
            AbstractXmlElementGenerator elementGenerator = new UpdateByPrimaryKeySelectiveElementGenerator();
            initializeAndExecuteGenerator(elementGenerator, parentElement);
        }
    }
    
    
    protected void addUpdateByPrimaryKeyElement(
            XmlElement parentElement) {
        if (introspectedTable.getRules()
                .generateUpdateByPrimaryKeyWithoutBLOBs()) {
            AbstractXmlElementGenerator elementGenerator = new UpdateByPrimaryKeyElementGenerator();
            initializeAndExecuteGenerator(elementGenerator, parentElement);
        }
    }
    
    
}
