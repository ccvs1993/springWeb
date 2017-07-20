package com.crm.course.web;

import com.crm.course.domain.CrmCourseType;
import com.crm.course.service.CourseTypeService;
import com.crm.page.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;

/**
 * Created by wangfei on 2017/7/6.
 */
public class CourseAction extends ActionSupport implements ModelDriven<CrmCourseType>{
    private CrmCourseType crmCourseType=new CrmCourseType();
    @Override
    public CrmCourseType getModel() {
        return crmCourseType;
    }

    private CourseTypeService courseTypeService;

    public void setCourseTypeService(CourseTypeService courseTypeService) {
        this.courseTypeService = courseTypeService;
    }

    private int pageNum=1;
    private int pageSize=2;

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /////////////////////////////////////////////////////////////
    public String findAll(){
//        List<CrmCourseType> allCourse = courseTypeService.findAll(crmCourseType);
//        ActionContext.getContext().getValueStack().set("allCourse",allCourse);
        PageBean<CrmCourseType> pageBean = courseTypeService.findAll(crmCourseType, pageNum, pageSize);
        ActionContext.getContext().getValueStack().push(pageBean);
        System.out.println(pageBean.getData());
        return "findAll";
    }

    public String editUI(){
        if(crmCourseType.getCourseTypeId()!=null){
            CrmCourseType courseType = courseTypeService.findById(crmCourseType);
            ActionContext.getContext().getValueStack().push(courseType);
        }
        return "editUI";
    }

    public String addOrEdit(){
        courseTypeService.saveOrUpdate(crmCourseType);
        return "addOrEdit";
    }
}
