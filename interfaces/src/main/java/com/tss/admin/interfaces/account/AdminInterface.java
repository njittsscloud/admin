package com.tss.admin.interfaces.account;


import com.tss.admin.interfaces.account.vo.LoginUserInfoRespVO;
import com.tss.admin.interfaces.account.vo.UserIdentityVO;

import javax.servlet.http.HttpServletResponse;

public interface AdminInterface {
    LoginUserInfoRespVO doLogin(HttpServletResponse response, UserIdentityVO userIdentity);
}
