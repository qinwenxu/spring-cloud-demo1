package com.front.controller;

import com.qwx.product.feign.user.UserFeignService;
import com.qwx.common.base.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
