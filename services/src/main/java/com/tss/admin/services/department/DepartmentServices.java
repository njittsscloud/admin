/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Liu Tong
 * Date: 2018/12/4
 * Description:DepartmentServices.java
 */
package com.tss.admin.services.department;

import com.github.pagehelper.PageInfo;
import com.tss.admin.interfaces.department.DepartmentInterface;
import com.tss.admin.interfaces.department.request.EditdepartmentInfoReq;
import com.tss.admin.interfaces.department.request.QueryDepartmentListReq;
import com.tss.admin.interfaces.department.response.DepartmentListResp;
import com.tss.admin.services.department.feign.DepartmentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Liu Tong
 */
@Service
public class DepartmentServices implements DepartmentInterface {

    @Autowired
    DepartmentFeignService departmentFeignService;


    @Override
    public PageInfo<DepartmentListResp> queryDepartmentList(QueryDepartmentListReq req) {

        return departmentFeignService.querydepartmentList(req);
    }

    @Override
    public void editDepartment(EditdepartmentInfoReq req) {
        departmentFeignService.editDepartmentInfo(req);
    }

    @Override
    public void delete(int id) {
        departmentFeignService.deletedepartMentInfo(id);
    }
}
