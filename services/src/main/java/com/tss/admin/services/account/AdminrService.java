package com.tss.admin.services.account;

import com.tss.admin.interfaces.account.AdminInterface;
import com.tss.admin.interfaces.account.vo.LoginUserInfoRespVO;
import com.tss.admin.interfaces.account.vo.LoginUserInfoVO;
import com.tss.admin.interfaces.account.vo.UserIdentityVO;
import com.tss.admin.services.account.feign.AdminFeignService;
import com.tss.basic.common.util.ModelMapperUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Service
public class AdminrService implements AdminInterface {

    @Autowired
    private AdminFeignService adminFeignService;

    @Override
    public LoginUserInfoRespVO doLogin(HttpServletResponse response, UserIdentityVO userIdentity) {
        LoginUserInfoVO loginUserInfo = adminFeignService.doLogin(userIdentity);
        this.setCookie(response, loginUserInfo.getCookieInfo());
        return ModelMapperUtil.strictMap(loginUserInfo, LoginUserInfoRespVO.class);
    }

    // 浏览器不存储cookie
    private void setCookie(HttpServletResponse response, LoginUserInfoVO.CookieInfo cookieInfo) {
        Cookie cookie = new Cookie(cookieInfo.getCookieName(), cookieInfo.getCookieValue());
        cookie.setPath(cookieInfo.getCookiePath());
        cookie.setDomain(cookieInfo.getCookieDomain());
        response.addCookie(cookie);
    }
}
