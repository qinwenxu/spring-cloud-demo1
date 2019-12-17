package com.qwx.product.feign.user;

import com.qwx.common.base.entity.user.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@FeignClient("${server.gateway.name}")
@RequestMapping(value = "/api/base/restful/userRestController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//@FeignClient("base-dev")
//@RequestMapping(value = "/base/restful/userRestController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public interface UserFeignService {

    @RequestMapping(value = "getUserList", method = RequestMethod.GET)
    List<User> getUserList();
}
