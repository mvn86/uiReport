package com.ace.admin.report.exception;

/**
 * Created by yuchao on 2017/7/27.
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
