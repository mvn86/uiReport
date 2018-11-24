package com.ace.admin.report.common;


/**
 * 收集结果集
 *
 * @param <T> 任意类型
 */
public class ResultSet<T> {

    // 定义结果集 T 类型
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
