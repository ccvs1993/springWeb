package com.crm.course.dao;

import com.crm.course.domain.CrmCourseType;

import java.util.List;

/**
 * Created by wangfei on 2017/7/6.
 */
public interface CourseTypeDao {
    public List<CrmCourseType> findAll();
    public CrmCourseType findById(CrmCourseType courseType);
    public void saveOrUpdate(CrmCourseType courseType);
}
