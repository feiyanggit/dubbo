package com.feiyang.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.feiyang.dubbo.domain.User.User;

import java.util.Random;

/**
 * Created by feiyang on 2019/4/10.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User saveUser(User user) {
        user.setId(new Random().nextInt());
        System.out.println(user.toString());
        return user;
    }
}
