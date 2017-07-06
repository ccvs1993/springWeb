package com.test;


import com.alibaba.fastjson.JSON;
import com.crm.course.dao.CourseTypeDao;
import com.crm.course.domain.CrmCourseType;
import com.crm.course.service.CourseTypeService;
import com.crm.department.domain.CrmDepartment;
import com.crm.department.service.DepartmentService;
import com.crm.post.domain.CrmPost;
import com.crm.post.service.CrmPostService;
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

    @Autowired
    private CrmPostService postService;
    @Autowired
    private CourseTypeService courseTypeService;

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

    @org.junit.Test
    public void testFindPostWithDept() {
        CrmDepartment department=new CrmDepartment();
        department.setDepId("2c9091c14c78e58b014c78e67de10001");
        List<CrmPost> posts = postService.findAll(department);
        if(posts.size()>0) {
        for (CrmPost post : posts) {
            System.out.println(post);
        }
        }
        System.out.println("over");
    }

    @org.junit.Test
    public void testCourseFindAll() {
        CrmCourseType crmCourseType=new CrmCourseType();
        crmCourseType.setCourseName("java");
        courseTypeService.findAll(crmCourseType);
//        String conditions=" and courseName like ";
//        Object[] params={"%java%"};
        List<CrmCourseType> all = courseTypeService.findAll(crmCourseType);
        for (CrmCourseType courseType : all) {
            System.out.println(courseType);
        }
    }
}
