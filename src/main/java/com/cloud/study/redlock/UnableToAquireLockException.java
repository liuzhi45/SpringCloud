package com.cloud.study.redlock;

/**
 * @author 刘智
 * 异常类
 * Created by 2017-12-11
 */
public class UnableToAquireLockException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UnableToAquireLockException() {
    }

    public UnableToAquireLockException(String message) {
        super(message);
    }

    public UnableToAquireLockException(String message, Throwable cause) {
        super(message, cause);
    }
}
