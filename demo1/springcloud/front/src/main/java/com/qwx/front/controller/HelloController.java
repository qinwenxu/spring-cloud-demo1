package com.qwx.front.controller;

import com.qwx.common.base.entity.user.User;
import com.qwx.front.mq.MessageProducer;
import com.qwx.product.feign.user.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserFeignService userFeignService;

    @RequestMapping("getUserList")
    public List<User> hello() {
        List<User> userList = userFeignService.getUserList();
        return userList;
    }

}
