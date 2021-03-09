package com.hmt.generatemapper.introspected;

import java.util.List;

import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.codegen.AbstractJavaGenerator;
import org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl;
import org.mybatis.generator.codegen.mybatis3.model.PrimaryKeyGenerator;

import com.hmt.generatemapper.generator.model.ModelGenerator;

public class ClearIntrospectedTable extends IntrospectedTableMyBatis3Impl {
//	private static final Logger logger = LoggerFactory.getLogger(SpringManagedTransaction.class);

    protected void calculateJavaModelGenerators(List<String> warnings,
            ProgressCallback progressCallback) {
    	
//        if (getRules().generateExampleClass()) {
//            AbstractJavaGenerator javaGenerator = new ExampleGenerator();
//            initializeAbstractGenerator(javaGenerator, warnings,
//                    progressCallback);
//            javaModelGenerators.add(javaGenerator);
//        }

        if (getRules().generatePrimaryKeyClass()) {
            AbstractJavaGenerator javaGenerator = new PrimaryKeyGenerator();
            initializeAbstractGenerator(javaGenerator, warnings,
                    progressCallback);
            javaModelGenerators.add(javaGenerator);
        }

        if (getRules().generateBaseRecordClass()) {
            AbstractJavaGenerator javaGenerator = new ModelGenerator();
            initializeAbstractGenerator(javaGenerator, warnings,
                    progressCallback);
            javaModelGenerators.add(javaGenerator);
        }

//        if (getRules().generateRecordWithBLOBsClass()) {
//            AbstractJavaGenerator javaGenerator = new RecordWithBLOBsGenerator();
//            initializeAbstractGenerator(javaGenerator, warnings,
//                    progressCallback);
//            javaModelGenerators.add(javaGenerator);
//        }
    }
}
