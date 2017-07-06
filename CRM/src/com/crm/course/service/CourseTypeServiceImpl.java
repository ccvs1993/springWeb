package com.crm.course.service;

import com.crm.course.dao.CourseTypeDao;
import com.crm.course.domain.CrmCourseType;

import java.util.List;

/**
 * Created by wangfei on 2017/7/6.
 */
public class CourseTypeServiceImpl implements CourseTypeService{
    private CourseTypeDao courseTypeDao;

    public void setCourseTypeDao(CourseTypeDao courseTypeDao) {
        this.courseTypeDao = courseTypeDao;
    }

    @Override
    public List<CrmCourseType> findAll() {
        List<CrmCourseType> allCourse = courseTypeDao.findAll();
        return allCourse;
    }

    @Override
    public CrmCourseType findById(CrmCourseType courseType) {
        CrmCourseType crmCourseType = courseTypeDao.findById(courseType);
        return crmCourseType;
    }

    @Override
    public void saveOrUpdate(CrmCourseType courseType) {
        courseTypeDao.saveOrUpdate(courseType);
    }
}
