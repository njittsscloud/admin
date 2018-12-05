/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Liu Tong
 * Date: 2018/12/5
 * Description:ClassesFeignServiceFallBack.java
 */
package com.tss.admin.services.classes.feign.fallback;

import com.github.pagehelper.PageInfo;
import com.tss.admin.interfaces.classes.request.ClassInfoDeleteReq;
import com.tss.admin.interfaces.classes.request.ClassInfoEditReq;
import com.tss.admin.interfaces.classes.request.ClassListQueryReq;
import com.tss.admin.interfaces.classes.response.ClassListResp;
import com.tss.admin.services.classes.feign.ClassesFeignService;
import com.tss.basic.common.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Liu Tong
 */
public class ClassesFeignServiceFallBack implements ClassesFeignService {
    private static Logger LOG = LoggerFactory.getLogger(ClassesFeignServiceFallBack.class);

    @Override
    public PageInfo<ClassListResp> queryClassList(ClassListQueryReq req) {
        LOG.error("class queryClassList is failed param={} " + JsonUtil.obj2json(req));
        return null;
    }

    @Override
    public void editClassInfo(ClassInfoEditReq req) {
        LOG.error("class queryClassList is failed param={} " + JsonUtil.obj2json(req));
    }

    @Override
    public void deleteClassInfo(ClassInfoDeleteReq req) {
        LOG.error("class queryClassList is failed param={} " + JsonUtil.obj2json(req));
    }
}
