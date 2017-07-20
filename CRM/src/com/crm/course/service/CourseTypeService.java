package com.crm.course.service;

import com.crm.course.domain.CrmCourseType;
import com.crm.page.PageBean;

import java.util.List;

/**
 * Created by wangfei on 2017/7/6.
 */
public interface CourseTypeService {
    public List<CrmCourseType> findAll(CrmCourseType crmCourseType);
    public CrmCourseType findById(CrmCourseType courseType);
    public void saveOrUpdate(CrmCourseType courseType);

    public PageBean<CrmCourseType> findAll(CrmCourseType courseType, int pageNum, int pageSize);
}
