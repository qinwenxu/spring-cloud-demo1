package com.qwx.base.service.user.impl;

import com.qwx.base.dao.user.UserMapper;
import com.qwx.base.service.user.IUserService;
import com.qwx.common.base.entity.user.User;
import com.qwx.common.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Resource
    private RedisUtils redisUtils;


    @Override
    public List<User> getUserList() {
        List<User> userList = userMapper.getUserList();
        //redisUtils.set("p123", "666");
        return userList;
    }
}
