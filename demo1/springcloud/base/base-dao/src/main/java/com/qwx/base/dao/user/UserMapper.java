package com.qwx.base.dao.user;

import com.qwx.common.base.entity.user.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {

    List<User> getUserList();
}
