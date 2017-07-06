package com.crm.staff.service;

import com.crm.staff.dao.StaffDao;
import com.crm.staff.domain.CrmStaff;
import com.crm.util.MyStringUtils;

import java.util.List;

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

    @Override
    public List<CrmStaff> findAllStaff() {
        List<CrmStaff> allStaff = staffDao.findAll();
        return allStaff;
    }

    @Override
    public CrmStaff findById(String staffId) {
        return staffDao.findByID(staffId);
    }

    @Override
    public void updateStaff(CrmStaff crmStaff) {
        System.out.println("============传入============");
        System.out.println(crmStaff);
        CrmStaff staff = staffDao.findByID(crmStaff.getStaffId());
        System.out.println("============查找============");
        System.out.println(staff);
        // 判断密码是否被修改
        if(!staff.getLoginPwd().equals(crmStaff.getLoginPwd())){
            staff.setLoginPwd(MyStringUtils.getMD5Value(crmStaff.getLoginPwd()));
        }
        staff.setStaffName(crmStaff.getStaffName());
        staff.setLoginName(crmStaff.getLoginName());
        staff.setCrmPost(crmStaff.getCrmPost());
        staff.setGender(crmStaff.getGender());
        staff.setOnDutyDate(crmStaff.getOnDutyDate());
    }
}
