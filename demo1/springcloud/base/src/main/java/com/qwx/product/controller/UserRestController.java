package com.qwx.product.controller;

import com.qwx.common.base.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/restful/userRestController")
public class UserRestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "getUserList")
    public List<User> getUserList() {
        List<User> userList = new ArrayList<User>();
        User user = new User();
        user.setUserName("张三");
        user.setId(port);
        userList.add(user);

        user = new User();
        user.setUserName("李四");
        userList.add(user);

        user = new User();
        user.setUserName("王五");
        userList.add(user);
        return userList;
    }


}
