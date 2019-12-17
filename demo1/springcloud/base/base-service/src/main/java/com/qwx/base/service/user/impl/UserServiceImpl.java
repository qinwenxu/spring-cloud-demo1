package com.qwx.base.service.user.impl;

import com.qwx.base.dao.user.UserMapper;
import com.qwx.base.service.user.IUserService;
import com.qwx.common.base.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        List<User> userList = userMapper.getUserList();
        return userList;
    }
}
