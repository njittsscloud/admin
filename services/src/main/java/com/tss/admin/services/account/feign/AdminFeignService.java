package com.tss.admin.services.account.feign;

import com.tss.admin.interfaces.account.vo.LoginUserInfoVO;
import com.tss.admin.interfaces.account.vo.UserBaseInfo;
import com.tss.admin.interfaces.account.vo.UserIdentityVO;
import com.tss.admin.services.account.feign.callback.AdminFeignServiceCallback;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "${account.serviceId}", fallback = AdminFeignServiceCallback.class)
public interface AdminFeignService {

    @RequestMapping(value = "/teacher/login", method = RequestMethod.POST)
    LoginUserInfoVO doLogin(UserIdentityVO userIdentity);

    @RequestMapping(value = "/getUserBaseInfoById/{id}", method = RequestMethod.GET)
    UserBaseInfo getUserBaseInfoById(@PathVariable("id") Long id);

}
