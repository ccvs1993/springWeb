package com.crm.staff.service;

import com.crm.staff.dao.StaffDao;
import com.crm.staff.domain.CrmStaff;
import com.crm.util.MyStringUtils;

/**
 * Created by wangfei on 2017/7/2.
 */
public class StaffServiceImpl implements StaffService{

    private StaffDao staffDao;

    public void setStaffDao(StaffDao staffDao) {
        this.staffDao = staffDao;
    }

    @Override
    public CrmStaff login(CrmStaff crmStaff) {
        String loginPwd = MyStringUtils.getMD5Value(crmStaff.getLoginPwd());
        return staffDao.find(crmStaff.getLoginName(),loginPwd);
    }
}
