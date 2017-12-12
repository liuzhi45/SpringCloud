package com.cloud.study.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis扫描接口
 *
 * @author liuzh
 * @since 2015-12-19 14:46
 */
@Configuration
@AutoConfigureAfter(MyBatisConfig.class)
@EnableTransactionManagement(proxyTargetClass = true)
public class MyBatisMapperScannerConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
    	 MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
         mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
         mapperScannerConfigurer.setBasePackage("com.cloud.study.dao.mapper");
        return mapperScannerConfigurer;
    }

}