package com.qwx.base.controller;

import com.qwx.base.service.user.IUserService;
import com.qwx.common.base.entity.user.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("/restful/userRestController")
public class UserRestController {

    @Value("${server.port}")
    private String port;

    @Resource
    private IUserService userService;

    @RequestMapping(value = "getUserList")
    @ResponseBody
    public List<User> getUserList() {
        List<User> userList = userService.getUserList();
        for(User u : userList) {
            u.setId(port);
        }
        return userList;
    }


}
