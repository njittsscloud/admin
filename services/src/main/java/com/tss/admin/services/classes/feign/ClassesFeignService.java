/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Liu Tong
 * Date: 2018/12/5
 * Description:ClassesFeignService.java
 */
package com.tss.admin.services.classes.feign;

import com.github.pagehelper.PageInfo;
import com.tss.admin.interfaces.classes.request.ClassInfoDeleteReq;
import com.tss.admin.interfaces.classes.request.ClassInfoEditReq;
import com.tss.admin.interfaces.classes.request.ClassListQueryReq;
import com.tss.admin.interfaces.classes.response.ClassListResp;
import com.tss.admin.services.classes.feign.fallback.ClassesFeignServiceFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Liu Tong
 */
@FeignClient(serviceId = "${data.serviceId}", fallback = ClassesFeignServiceFallBack.class)
public interface ClassesFeignService {

    @RequestMapping(value = "/classes/queryClassList", method = RequestMethod.POST)
    PageInfo<ClassListResp> queryClassList(ClassListQueryReq req);

    @RequestMapping(value = "/classes/editClassInfo", method = RequestMethod.POST)
    void editClassInfo(ClassInfoEditReq req);

    @RequestMapping(value = "/classes/deleteClassBatch", method = RequestMethod.POST)
    void deleteClassInfo(ClassInfoDeleteReq req);
}
