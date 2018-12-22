package com.ace.admin.report.service.impl;

import com.ace.admin.report.bo.User;
import com.ace.admin.report.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Chris
 */
@CacheConfig(cacheNames = "users")
@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Cacheable
    @Override
    public List<User> queryUserList() {
        return query();
    }

    @Override
    public List<User> deleteUser(String userName) {
        List<User> userList = query();
        return userList.stream()
                .filter(user -> !user.getName().equals(userName))
                .collect(Collectors.toList());
    }

    /**
     * 测试基础数据
     *
     * @return
     */
    private List<User> query() {
        logger.info("重新查询。。。。。。。。。。。。。。。。。");
        List<User> userList = new ArrayList<>();
        User user1 = new User("chris1", 1, 21, "2016-05-01", "上海");
        User user2 = new User("chris2", 1, 21, "2016-05-02", "上海");
        User user3 = new User("chris3", 1, 21, "2016-05-03", "上海");
        User user4 = new User("chris4", 1, 21, "2016-05-04", "上海");
        User user5 = new User("chris5", 1, 21, "2016-05-05", "上海");
        User user6 = new User("chris6", 1, 21, "2016-05-06", "上海");
        User user7 = new User("chris7", 1, 21, "2016-05-07", "上海");
        User user8 = new User("chris8", 1, 21, "2016-05-08", "上海");
        User user9 = new User("chris9", 1, 21, "2016-05-09", "上海");
        User user10 = new User("chris10", 1, 21, "2016-05-15", "上海");
        User user11 = new User("chris11", 1, 21, "2016-05-25", "上海");
        User user12 = new User("chris12", 1, 21, "2016-02-15", "上海");
        User user13 = new User("chris13", 1, 21, "2016-03-25", "上海");
        User user14 = new User("chris14", 1, 21, "2016-04-15", "上海");
        User user15 = new User("chris15", 1, 21, "2016-07-25", "上海");
        User user16 = new User("chris16", 1, 21, "2016-12-25", "上海");
        User user17 = new User("chris17", 1, 21, "2016-11-25", "上海");
        User user18 = new User("chris18", 1, 21, "2016-10-95", "上海");
        User user19 = new User("chris19", 1, 21, "2016-06-15", "上海");
        User user20 = new User("chris20", 1, 21, "2016-09-05", "上海");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);
        userList.add(user8);
        userList.add(user9);
        userList.add(user10);
        userList.add(user11);
        userList.add(user12);
        userList.add(user13);
        userList.add(user14);
        userList.add(user15);
        userList.add(user16);
        userList.add(user17);
        userList.add(user18);
        userList.add(user19);
        userList.add(user20);
        return userList;
    }
}
