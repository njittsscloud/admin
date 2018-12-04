package com.tss.admin.services.department.feign;

import com.github.pagehelper.PageInfo;
import com.tss.admin.interfaces.department.request.EditdepartmentInfoReq;
import com.tss.admin.interfaces.department.request.QueryDepartmentListReq;
import com.tss.admin.interfaces.department.response.DepartmentListResp;
import com.tss.admin.services.department.feign.fallback.DepartmentFeignServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "${data.serviceId}", fallback = DepartmentFeignServiceFallback.class)
public interface DepartmentFeignService {

    @RequestMapping(value = "/department/queryDepartmentList", method = RequestMethod.POST)
    PageInfo<DepartmentListResp> querydepartmentList(QueryDepartmentListReq req);

    @RequestMapping(value = "/department/editDepartmentInfo", method = RequestMethod.POST)
    void editDepartmentInfo(EditdepartmentInfoReq req);

    @RequestMapping(value ="/department/deleteDepartMent/{id}",method = RequestMethod.GET)
    void deletedepartMentInfo(@PathVariable("id") Integer id);

}