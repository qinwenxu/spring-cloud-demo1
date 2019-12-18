package com.qwx.product.controller;

import com.qwx.common.base.entity.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/restful/userRestController")
public class UserRestController {

    @RequestMapping(value = "getUserList1")
    public List<User> getUserList1() {
        List<User> userList = new ArrayList<User>();
        User user = new User();
        userList.add(user);
        return userList;
    }


}
