package com.ace.admin.report.service;

import com.ace.admin.report.bo.User;

import java.util.List;

/**
 * @author Chris
 */
public interface UserService {

    /**
     * 获取所有用户列表
     *
     * @return
     */
    List<User> queryUserList();

    /**
     * 删除用户
     *
     * @param userName
     * @return
     */
    List<User> deleteUser(String userName);
}
