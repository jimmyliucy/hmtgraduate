package com.hmt.generatemapper;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainMapperGenerator {
    public static void main( String[] args ) throws Exception {
        List<String> warnings = new ArrayList<String>();
        File configFile = new File("F:\\hmtgraduate\\hmt-graduate\\src\\test\\resources\\generatorConfig_mysql.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(true);

//        5583923470024030046L
        
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

}
