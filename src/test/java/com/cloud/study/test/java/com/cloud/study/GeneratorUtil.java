//package com.cloud.study.test.java.com.cloud.study;
//
//import org.junit.Test;
//import org.mybatis.generator.api.MyBatisGenerator;
//import org.mybatis.generator.config.Configuration;
//import org.mybatis.generator.config.xml.ConfigurationParser;
//import org.mybatis.generator.internal.DefaultShellCallback;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//
//public class GeneratorUtil {
//
//    /**
//     * XML配置自动代码生成
//     */
//    @Test
//    public void getGeneratorByXml(){
//        try {
//            List<String> warnings = new ArrayList<String>();
//            boolean overwrite = true;
//            File configFile = new File("D:\\eclipse\\cloud\\cloud\\src\\main\\resources\\generatorConfig.xml");
//            ConfigurationParser cp = new ConfigurationParser(warnings);
//            Configuration config = cp.parseConfiguration(configFile);
//            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//            myBatisGenerator.generate(null);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void getGeneratorByJava(){
//        try {
//
//            List<String> warnings = new ArrayList<String>();
//            boolean overwrite = true;
//            Configuration config = new Configuration();
//
//            //   ... fill out the config object as appropriate...
//
//            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//            myBatisGenerator.generate(null);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//}
