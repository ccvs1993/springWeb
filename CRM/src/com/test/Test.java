package com.test;


import com.crm.department.domain.CrmDepartment;
import com.crm.department.service.DepartmentService;
import com.crm.staff.domain.CrmStaff;
import com.crm.staff.service.StaffService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * Created by wangfei on 2017/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class Test {
    @Autowired
    private StaffService staffService;
    @Autowired
    private DepartmentService departmentService;
    @org.junit.Test
    public void test() {
        CrmStaff staff=new CrmStaff();
        staff.setLoginName("rose");
        staff.setLoginPwd("81dc9bdb52d04dc20036dbd8313ed055");
        CrmStaff staff1 = staffService.login(staff);
        System.out.println(staff1);
    }

    @org.junit.Test
    public void testFindById() {
        CrmStaff staff = staffService.findById("2c9091c14c78e58b014c78e759b40006");
        System.out.println(staff);
    }

    @org.junit.Test
    public void testFindDept() {
        List<CrmDepartment> ls = departmentService.findAll();
        for (CrmDepartment l : ls) {
            System.out.println(l);
        }
    }
}
