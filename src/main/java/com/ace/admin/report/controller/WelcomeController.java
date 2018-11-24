package com.ace.admin.report.controller;

import com.ace.admin.report.bo.User;
import com.ace.admin.report.common.ResultSet;
import com.ace.admin.report.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class WelcomeController {

    @Autowired
    private UserService userService;

    private Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @RequestMapping("/")
    public String path() {
        return "upload";
    }

    @RequestMapping("/404")
    public String errror404() {
        return "error/error-404";
    }

    @RequestMapping("/500")
    public String errror500() {
        return "error/error-500";
    }

    @RequestMapping("/index")
    String index() {
        return "index";
    }

    @RequestMapping("/about")
    String about() {
        return "about";
    }

    @RequestMapping("/tables")
    String tables() {
        return "tables";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    List<User> getQueryUser() {
        logger.info("request query user list .");
        return userService.queryUserList();
    }
}
