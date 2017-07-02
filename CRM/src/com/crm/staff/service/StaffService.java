package com.crm.staff.service;

import com.crm.staff.domain.CrmStaff;

import java.util.List;

/**
 * Created by wangfei on 2017/7/2.
 */
public interface StaffService {
    public CrmStaff login(CrmStaff crmStaff);
    public List<CrmStaff> findAllStaff();
}
