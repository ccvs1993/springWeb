package com.crm.staff.dao;

import com.crm.staff.domain.CrmStaff;

/**
 * Created by wangfei on 2017/7/2.
 */
public interface StaffDao {
    public CrmStaff find(String loginName,String loginPwd);
}
