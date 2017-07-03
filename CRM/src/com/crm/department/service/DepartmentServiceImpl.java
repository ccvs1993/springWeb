package com.crm.department.service;

import com.crm.department.dao.DepartmentDao;
import com.crm.department.domain.CrmDepartment;

import java.util.List;

/**
 * Created by wangfei on 2017/7/3.
 */
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentDao departmentDao;

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public List<CrmDepartment> findAll() {
        List<CrmDepartment> list = departmentDao.findAll();
        return list;
    }
}
