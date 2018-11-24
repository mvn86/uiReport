package com.ace.admin.report.service;

import com.ace.admin.report.bo.User;

import java.util.List;

public interface UserService {

    /**
     *
     * @return
     */
    List<User> queryUserList();

    List<User> deleteUser(String userName);
}
