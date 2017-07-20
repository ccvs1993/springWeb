package com.crm.course.dao;

import com.crm.course.domain.CrmCourseType;

import java.util.List;

/**
 * Created by wangfei on 2017/7/6.
 */
public interface CourseTypeDao {
    public List<CrmCourseType> findAll(String contidtions,Object[] params);
    public CrmCourseType findById(CrmCourseType courseType);
    public void saveOrUpdate(CrmCourseType courseType);
    //查询总记录数
    public int getTotalRecord(String contidtions,Object[] params);
    //分页查询
    public List<CrmCourseType> findAll(String contidtions,Object[] params,int startIndex,int pageSize);
}
