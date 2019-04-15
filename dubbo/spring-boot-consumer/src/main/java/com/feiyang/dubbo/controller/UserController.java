package com.feiyang.dubbo.controller;

import com.feiyang.dubbo.service.UserDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by feiyang on 2019/4/10.
 */
@RestController
public class UserController {

    @Autowired
    UserDubboConsumerService userDubboConsumerService;

    @RequestMapping("/save")
    public Object save(){

        return userDubboConsumerService.saveUser();
    }
}
