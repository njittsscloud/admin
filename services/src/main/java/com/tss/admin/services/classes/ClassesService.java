/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Liu Tong
 * Date: 2018/12/5
 * Description:ClassesService.java
 */
package com.tss.admin.services.classes;

import com.github.pagehelper.PageInfo;
import com.tss.admin.interfaces.classes.ClassesInterface;
import com.tss.admin.interfaces.classes.request.ClassInfoDeleteReq;
import com.tss.admin.interfaces.classes.request.ClassInfoEditReq;
import com.tss.admin.interfaces.classes.request.ClassListQueryReq;
import com.tss.admin.interfaces.classes.response.ClassListResp;
import com.tss.admin.services.classes.feign.ClassesFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Liu Tong
 */
@Service
public class ClassesService implements ClassesInterface {

    @Autowired
    ClassesFeignService classesFeignService;

    @Override
    public PageInfo<ClassListResp> queryClassList(ClassListQueryReq req) {
        return classesFeignService.queryClassList(req);
    }

    @Override
    public void editClass(ClassInfoEditReq req) {
        classesFeignService.editClassInfo(req);
    }

    @Override
    public void delete(ClassInfoDeleteReq ids) {
        classesFeignService.deleteClassInfo(ids);
    }
}
