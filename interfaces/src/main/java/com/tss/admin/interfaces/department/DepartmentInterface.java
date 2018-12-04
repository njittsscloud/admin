/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Tong Liu
 * Date: 2018/11/29
 * Description:DepartmentInterface.java
 */
package com.tss.admin.interfaces.department;

import com.github.pagehelper.PageInfo;
import com.tss.admin.interfaces.department.request.EditdepartmentInfoReq;
import com.tss.admin.interfaces.department.request.QueryDepartmentListReq;
import com.tss.admin.interfaces.department.response.DepartmentListResp;

/**
 * @author Tong Liu
 */
public interface DepartmentInterface {
    
    PageInfo<DepartmentListResp> queryDepartmentList(QueryDepartmentListReq req);
    
    void editDepartment(EditdepartmentInfoReq req);
    
    void delete(int id);
}
