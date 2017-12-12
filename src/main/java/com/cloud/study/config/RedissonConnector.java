package com.cloud.study.config;

import javax.annotation.PostConstruct;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author 刘智
 * 获取RedissonClient连接类
 * Created by 2017-12-11
 */
@Component
public class RedissonConnector {
	
	@Autowired
	private Environment env;
	
    RedissonClient redisson;
    @PostConstruct
    public void init(){
    	Config config = new Config();
    	config.useSingleServer().setAddress(env.getProperty("spring.redis.host")+":"+env.getProperty("spring.redis.port"));
    	
    	
        redisson = Redisson.create(config);
    }

    public RedissonClient getClient(){
        return redisson;
    }

}
