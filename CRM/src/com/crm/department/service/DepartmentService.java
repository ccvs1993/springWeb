package com.crm.department.service;

import com.crm.department.domain.CrmDepartment;

import java.util.List;

/**
 * Created by wangfei on 2017/7/3.
 */
public interface DepartmentService {
    public List<CrmDepartment> findAll();
}
