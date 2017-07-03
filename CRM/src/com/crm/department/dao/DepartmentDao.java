package com.crm.department.dao;

import com.crm.department.domain.CrmDepartment;

import java.util.List;

/**
 * Created by wangfei on 2017/7/3.
 */
public interface DepartmentDao {
    public List<CrmDepartment> findAll();
}
