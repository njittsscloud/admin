package com.tss.admin.web.account;

import com.tss.admin.interfaces.account.AdminInterface;
import com.tss.admin.interfaces.account.vo.LoginUserInfoRespVO;
import com.tss.admin.interfaces.account.vo.UserIdentityVO;
import com.tss.basic.site.argumentresolver.JsonParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * 管理员控制器
 * @author zhoujie
 * @create 2018-12-04 20:51
 **/
@Api(value = "管理员模块", tags = "AdminController", description = "管理员模块")
@RestController
@RequestMapping("/account/admin")
public class AdminController {
	private static final Logger LOG = LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private AdminInterface adminInterface;

	@ApiOperation(value = "管理员登录", notes = "管理员登录")
	@PostMapping(value = "/login")
	public LoginUserInfoRespVO login(HttpServletResponse response, @JsonParam(validation = true) UserIdentityVO userIdentity) {
		return adminInterface.doLogin(response, userIdentity);
	}


}
