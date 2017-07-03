package com.crm.staff.dao;

import com.crm.staff.domain.CrmStaff;

import java.util.List;

/**
 * Created by wangfei on 2017/7/2.
 */
public interface StaffDao {
    public CrmStaff find(String loginName,String loginPwd);
    public List<CrmStaff> findAll();
    //根据ID查询
    public CrmStaff findByID(String staffId);
}
