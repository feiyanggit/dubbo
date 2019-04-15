package com.feiyang.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.feiyang.dubbo.domain.User.User;
import org.springframework.stereotype.Component;

/**
 * Created by feiyang on 2019/4/10.
 */
@Component
public class UserDubboConsumerService {

    @Reference
    UserService userService;

    public User saveUser() {
        User user = new User();
        user.setName("feiyang");
        return userService.saveUser(user);
    }
}

