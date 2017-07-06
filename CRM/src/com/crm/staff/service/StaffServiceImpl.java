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
        CrmStaff staff = staffDao.findByID(crmStaff.getStaffId());
        // 判断密码是否被修改
        if(!staff.getLoginPwd().equals(crmStaff.getLoginPwd())){
            staff.setLoginPwd(MyStringUtils.getMD5Value(crmStaff.getLoginPwd()));
        }
        //利用一级缓存改变自动保存
        staff.setStaffName(crmStaff.getStaffName());
        staff.setLoginName(crmStaff.getLoginName());
        staff.setCrmPost(crmStaff.getCrmPost());
        staff.setGender(crmStaff.getGender());
        staff.setOnDutyDate(crmStaff.getOnDutyDate());
    }

    @Override
    public void saveOrUpdate(CrmStaff crmStaff) {
            staffDao.saveOrUpdate(crmStaff);
    }
}
