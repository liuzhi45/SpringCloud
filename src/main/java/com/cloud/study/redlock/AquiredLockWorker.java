package com.cloud.study.redlock;

/**
 * Created by liuzhi on 2017/4/5.
 * 
 */
/**
 * @author 刘智
 * 获取锁后需要处理的逻辑
 * Created by 2017-12-11
 * @param <T>
 */
public interface AquiredLockWorker<T> {
	
     T invokeAfterLockAquire() throws Exception;
}