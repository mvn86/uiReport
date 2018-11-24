package com.ace.admin.report.controller;

import com.ace.admin.report.bo.User;
import com.ace.admin.report.common.ResultSet;
import com.ace.admin.report.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by yuchao on 2017/8/27.
 */
@RestController
@RequestMapping("/query")
public class QueryController {

    private Logger logger = LoggerFactory.getLogger(QueryController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    ResultSet<List<User>> queryController(@RequestBody String userName) {
        logger.info("query user name {}", userName);
        List<User> userFilterList = userService.queryUserList()
                .stream()
                .filter(user -> user.getName().equals(userName))
                .collect(toList());
        ResultSet<List<User>> listResultSet = new ResultSet<>();
        listResultSet.setData(userFilterList);
        return listResultSet;
    }
}
