package com.tss.admin.services.department.feign.fallback;

import com.github.pagehelper.PageInfo;
import com.tss.admin.interfaces.department.request.EditdepartmentInfoReq;
import com.tss.admin.interfaces.department.request.QueryDepartmentListReq;
import com.tss.admin.interfaces.department.response.DepartmentListResp;
import com.tss.admin.services.department.feign.DepartmentFeignService;
import com.tss.basic.common.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DepartmentFeignServiceFallback implements DepartmentFeignService {
    private static final Logger LOG = LoggerFactory.getLogger(DepartmentFeignServiceFallback.class);

    @Override
    public PageInfo<DepartmentListResp> querydepartmentList(QueryDepartmentListReq req) {
        LOG.error("department querydepartmentList is fail param={}" + JsonUtil.obj2json(req));
        return null;
    }

    @Override
    public void editDepartmentInfo(EditdepartmentInfoReq req) {
        LOG.error("department editDepartmentInfo is fail param={}" + JsonUtil.obj2json(req));
    }

    @Override
    public void deletedepartMentInfo(Integer id) {
        LOG.error("department deletedepartMentInfo is fail param={}" + id);
    }
}
