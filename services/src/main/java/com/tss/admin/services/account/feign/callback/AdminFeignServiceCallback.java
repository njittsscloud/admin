package com.tss.admin.services.account.feign.callback;

import com.tss.admin.interfaces.account.vo.LoginUserInfoVO;
import com.tss.admin.interfaces.account.vo.UserBaseInfo;
import com.tss.admin.interfaces.account.vo.UserIdentityVO;
import com.tss.admin.services.account.feign.AdminFeignService;
import com.tss.basic.common.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AdminFeignServiceCallback implements AdminFeignService {
    private static final Logger LOG = LoggerFactory.getLogger(AdminFeignServiceCallback.class);

    @Override
    public UserBaseInfo getUserBaseInfoById(Long id) {
        LOG.error("teacher getUserBaseInfoById fail, id={}", id);
        return null;
    }

    @Override
    public LoginUserInfoVO doLogin(UserIdentityVO param) {
        LOG.error("teacher login fail, param={}", JsonUtil.obj2json(param));
        return null;
    }
}
