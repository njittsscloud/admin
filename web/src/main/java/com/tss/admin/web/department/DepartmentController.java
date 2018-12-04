/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Liu Tong
 * Date: 2018/12/4
 * Description:DepartmentController.java
 */
package com.tss.admin.web.department;

import com.github.pagehelper.PageInfo;
import com.tss.admin.interfaces.department.DepartmentInterface;
import com.tss.admin.interfaces.department.request.EditdepartmentInfoReq;
import com.tss.admin.interfaces.department.request.QueryDepartmentListReq;
import com.tss.admin.interfaces.department.response.DepartmentListResp;
import com.tss.basic.site.argumentresolver.JsonParam;
import com.tss.basic.site.exception.BusinessException;
import com.tss.basic.site.exception.ErrorCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 院系管理
 *
 * @author Liu Tong
 */
@Api(value = "院系管理",description = "院系管理")
@RestController
@RequestMapping("/departmnet")
public class DepartmentController {
    
    @Autowired
    DepartmentInterface departmentInterface;
    
    @ApiOperation(value = "查询院系列表信息",notes = "查询院系列表信息")
    @RequestMapping(value = "/queryDepartmentList",method = RequestMethod.POST)
    PageInfo<DepartmentListResp> querydepartmentList(@JsonParam QueryDepartmentListReq req){
        return  departmentInterface.queryDepartmentList(req);
    }

    @ApiOperation(value="編輯院系信息",notes = "編輯学生信息")
    @RequestMapping(value = "/editDepartmentInfo",method = RequestMethod.POST)
    void editDepartmentInfo(@JsonParam EditdepartmentInfoReq req){
        departmentInterface.editDepartment(req);
    }

    @ApiOperation(value = "删除院系信息",notes = "删除院系信息")
    @RequestMapping(value ="/deleteDepartMent/{id}",method = RequestMethod.GET)
    void deletedepartMentInfo(@PathVariable("id") Integer id){
        if (id==null){
            throw new BusinessException(new ErrorCode(1,"院系id不为空"));
        }
        departmentInterface.delete(id);
    }
    
}
